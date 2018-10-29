package personal.nathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-10-28.
 */
@SpringBootApplication
@EnableCaching
public class EhCacheApp {

    public static void main(String[] args) {
        SpringApplication.run(EhCacheApp.class, args);
    }
}
