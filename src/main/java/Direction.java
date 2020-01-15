import java.util.HashMap;
import java.util.Map;

public class Direction {
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";

    public static Map<Integer, String> directionMaps = new HashMap<Integer, String>() {{
            put(1, "N");
            put(2, "E");
            put(3, "S");
            put(4, "W");
        }};
}
