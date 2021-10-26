package utils;

import java.util.HashMap;
import java.util.Map;

public class SharedContext {
    private static Map<String, String> sharedContext = new HashMap<>();

    public static void setValue(String key, String value) {
        sharedContext.put(key, value);

    }

    public static String getValue(String key) {
        return sharedContext.get(key);

    }

}
