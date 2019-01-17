package personal.nathan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import personal.nathan.domain.User;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-11-11.
 */
@Service
public class UserService {

    @Autowired
    private EhCacheManager ehCacheManager;

    @Cacheable(value = "user", key = "#id")
    public User findUser(String id) {
        Object obj = ehCacheManager.getCache(id);
        if (obj == null) {
            // 模拟读取数据库耗时
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            User user = getUser();
            ehCacheManager.setCache(user.getId(), user);
            return user;
        }
        else {
            return (User) obj;
        }
    }

    private User getUser () {
        User user = new User();
        user.setAge(20);
        user.setId("1");
        getUser().setName("nathan");
        return user;
    }
}
