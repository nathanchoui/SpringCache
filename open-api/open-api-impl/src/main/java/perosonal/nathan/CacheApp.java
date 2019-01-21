package perosonal.nathan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by za-zhangwei002 on 2018/10/23.
 */
@SpringBootApplication
@Slf4j
public class CacheApp {
    public static void main(String[] args) {
        log.info("CacheApp starts ...");
        SpringApplication.run(CacheApp.class, args);
        log.info("CacheApp started successfully ...");
    }

}
