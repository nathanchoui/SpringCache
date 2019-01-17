package personal.nathan.caffeine.config;

import com.github.benmanes.caffeine.cache.stats.CacheStats;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by za-zhangwei002 on 2019/1/17.
 */
@Component
@Slf4j
public class CacheMonitor {

    @Autowired
    private CaffeineCache caffeineCache;

    @Scheduled(fixedDelay = 60 * 1000 * 30)
    public void printCacheState() {
        CacheStats cacheStats = caffeineCache.getNativeCache().stats();
//        CacheStats cacheStats = cache.stats();
        log.info("==================================================");
        log.info("requestCount  -> {}", cacheStats.requestCount());
        log.info("hitCount      -> {}", cacheStats.hitCount());
        log.info("hitRate       -> {}", cacheStats.hitRate());
        log.info("evictionCount -> {}", cacheStats.evictionCount());
        log.info("==================================================");
    }
}
