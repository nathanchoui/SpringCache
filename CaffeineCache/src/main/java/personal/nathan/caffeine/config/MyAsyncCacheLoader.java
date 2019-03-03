package personal.nathan.caffeine.config;

import com.github.benmanes.caffeine.cache.AsyncCacheLoader;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

/**
 * Created by za-zhangwei002 on 19-1-14.
 */
public class MyAsyncCacheLoader<Object> implements AsyncCacheLoader<Object, Object> {

    @Override
    public CompletableFuture<Object> asyncLoad(Object object, Executor executor) {
        return null;
    }

    @Override
    public CompletableFuture<Map<Object, Object>> asyncLoadAll(Iterable<? extends Object> keys, Executor executor) {
        return null;
    }

    @Override
    public CompletableFuture<Object> asyncReload(Object key, Object oldValue, Executor executor) {
        return null;
    }
}
