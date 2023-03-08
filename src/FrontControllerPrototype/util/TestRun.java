package FrontControllerPrototype.util;

import java.util.HashMap;
import java.util.Map;

public class TestRun {
    public static Map<String,String> superMap = new HashMap<>();


    public static void main(String[] args) {
        superMap.put("Hey", "Ho");
MapTestMaker maker = new MapTestMaker();
        for (String s :
                maker.makeList()) {
            System.out.println(s);

        }

    }
}
