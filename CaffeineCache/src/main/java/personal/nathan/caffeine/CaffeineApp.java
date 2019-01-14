package personal.nathan.caffeine;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by za-zhangwei002 on 2018/10/23.
 */
@SpringBootApplication
@Slf4j
public class CaffeineApp {
    public static void main(String[] args) {
        log.info("CaffeineApp starts ...");
        SpringApplication.run(CaffeineApp.class, args);
        log.info("CaffeineApp started successfully ...");
    }

}
