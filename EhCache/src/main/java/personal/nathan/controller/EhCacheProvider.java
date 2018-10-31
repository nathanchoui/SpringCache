package personal.nathan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import personal.nathan.domain.CacheBody;
import personal.nathan.service.CacheService;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-10-31.
 */
@RestController
public class EhCacheProvider {

    @Autowired
    private CacheService cacheService;

    @PutMapping("/cache")
    public String setCache(@RequestBody CacheBody cacheBody) {
        cacheService.setCache(cacheBody.getKey(), cacheBody.getValue());
        return "Y";
    }

    @GetMapping("/cache/{key}")
    public Object getCache(@PathVariable("key") String key) {
        return cacheService.getCache(key);
    }



}
