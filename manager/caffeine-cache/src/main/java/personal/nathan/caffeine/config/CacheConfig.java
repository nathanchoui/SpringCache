package personal.nathan.caffeine.config;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Created by za-zhangwei002 on 2019/1/16.
 */
@Configuration
@EnableCaching
public class CacheConfig {


//    @Bean
//    public Caffeine caffeine() {
//        Caffeine caffeine = Caffeine.newBuilder()
//                .maximumSize(1000)
//                // 每隔 xx 时间执行一次
//                .expireAfterWrite(20, TimeUnit.MINUTES)
//                .recordStats(ConcurrentStatsCounter::new);
//        return caffeine;
//    }
//
//    @Bean
//    public Cache cache(Caffeine caffeine) {
//        return caffeine.build();
//    }
//
//    @Bean
//    @Primary
//    public CacheManager cacheManager(Caffeine caffeine) {
//        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
//        cacheManager.setAllowNullValues(true);
//        cacheManager.setCaffeine(caffeine);
//        cacheManager.setCacheNames(Arrays.asList("MdmFileConfigCache"));
//        return cacheManager;
//    }

    @Bean
    @Primary
    public CaffeineCache caffeineCache() {
        Cache<Object, Object> cache = Caffeine.newBuilder().recordStats()
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(2000)
                .build();
        return new CaffeineCache("CaffeineCache", cache);
    }

    @Bean
    @Primary
    public CacheManager caffeineCacheManager(CaffeineCache caffeineCache) {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(caffeineCache));
        return cacheManager;
    }
}
