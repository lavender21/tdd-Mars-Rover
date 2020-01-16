import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Direction {
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";

    public static Map<Integer, String> maps = new HashMap<Integer, String>() {{
            put(1, NORTH);
            put(2, EAST);
            put(3, SOUTH);
            put(4, WEST);
        }};

    public static Map<String, Integer> invertMaps() {
        return maps.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }
}
