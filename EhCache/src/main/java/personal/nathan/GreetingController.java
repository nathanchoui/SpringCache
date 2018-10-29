package personal.nathan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-10-29.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private CacheManager cacheManager;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @PostMapping("/setCache")
    public String setCache(@RequestBody CacheBody cacheBody) {
        // FIXME 未拿到对象
        Cache cache = cacheManager.getCache("test");
        cache.put(cacheBody.getKey(), cacheBody.getValue());
        return "YES";
    }
}
