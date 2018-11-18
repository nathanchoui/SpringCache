package perosonal.nathan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created by za-zhangwei002 on 2018/10/23.
 */
@SpringBootApplication
@Slf4j
public class CacheApplication {
    public static void main(String[] args) {
        log.info("CacheApplication starts ...");
        SpringApplication.run(CacheApplication.class, args);
    }

}
