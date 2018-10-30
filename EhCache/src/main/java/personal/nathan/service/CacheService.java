package personal.nathan.service;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-10-30.
 */
@Service
public class CacheService {

    @Autowired
    private CacheManager cacheManager;

    public void setCache(String key, Object value) {
//        cacheManager.addCache();
    }

}
