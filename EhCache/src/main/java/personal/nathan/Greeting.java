package personal.nathan;

import lombok.Data;

/**
 * Description:
 * <p>
 * Created by nathan.z on 18-10-29.
 */
@Data
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
