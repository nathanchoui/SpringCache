package personal.nathan.service;

import com.alibaba.fastjson.JSON;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
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
        Element element = new Element(key, value);
        Cache cache = cacheManager.getCache("test");
        cache.put(element);
    }

    public Object getCache(String key) {
        Cache cache = cacheManager.getCache("test");
        Element element = cache.get(key);
        return element.getObjectValue();
    }

}
