package personal.nathan.caffeine.config;

import com.github.benmanes.caffeine.cache.AsyncCacheLoader;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 * <p>
 * Created by nathan.z on 19-1-14.
 */
@Configuration
public class CaffeineConfig {

//    @Bean
//    public CacheManager cacheManager() {
//        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
//        Caffeine caffeine = Caffeine.newBuilder()
//                .initialCapacity(10)
//                .maximumSize(100)
//                .refreshAfterWrite(1, TimeUnit.MINUTES)
//                .expireAfterAccess(1, TimeUnit.MINUTES)
//                .recordStats()
//                .buildAsync();
//    }

}
