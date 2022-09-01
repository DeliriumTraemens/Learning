package FrontControllerPrototype.Controller;

import FrontControllerPrototype.data.Request;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class Test2a {

    static Request request = new Request("cat", "getTotalCategoryList",111L,0L, 0L);



    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        ClassNameMapBuilder.buildClassNameMap();
        String response = ResponseFactory.responseBuilder(request);

        System.out.println("Resp Builder "+ ResponseFactory.responseBuilder(request));
        System.out.println(response);

    }

    public static Map<String, Class<?>> getEnumClassMap() {
        return ClassNameMapBuilder.enumClassMap;
    }
}
