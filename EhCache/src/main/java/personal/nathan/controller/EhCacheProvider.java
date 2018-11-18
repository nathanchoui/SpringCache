package personal.nathan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import personal.nathan.domain.CacheBody;
import personal.nathan.domain.User;
import personal.nathan.service.EhCacheManager;
import personal.nathan.service.UserService;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-10-31.
 */
@RestController
public class EhCacheProvider {

    @Autowired
    private EhCacheManager ehCacheManager;

    @Autowired
    private UserService userService;

    @PutMapping("/cache")
    public String setCache(@RequestBody CacheBody cacheBody) {
        ehCacheManager.setCache(cacheBody.getKey(), cacheBody.getValue());
        return "Y";
    }

    @GetMapping("/cache/{key}")
    public Object getCache(@PathVariable("key") String key) {
        return ehCacheManager.getCache(key);
    }

    @GetMapping("/user/{id}")
    public User user(@PathVariable("id") String id) {
        return userService.findUser(id);
    }



}
