package personal.nathan.domain;

import lombok.Data;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-10-29.
 */
@Data
public class CacheBody {

    private String key;

    private Object value;
}
