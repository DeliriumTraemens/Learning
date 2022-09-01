package FrontControllerPrototype.Controller;

import FrontControllerPrototype.enums.ServEnum;

import java.util.HashMap;
import java.util.Map;

public class ClassNameMapBuilder {
    static Map<String, Class<?>> enumClassMap = new HashMap();

    static void buildClassNameMap() {
        for (ServEnum value : ServEnum.values()) {
            enumClassMap.put(value.name, value.className);
        }
    }

    public static Map<String, Class<?>> getEnumClassMap() {
        return enumClassMap;
    }
}