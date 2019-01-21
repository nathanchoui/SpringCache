package personal.nathan.cache;

/**
 * 最简单的缓存协议，只有set 和 get两个方法
 *
 * <p>
 * Created by nathan.z on 18-10-31.
 */
public interface SimpleCache<T> {

    void set(String key, T value);

    T get(String key);
}
