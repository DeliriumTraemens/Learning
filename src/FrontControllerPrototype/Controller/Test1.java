package FrontControllerPrototype.Controller;

import FrontControllerPrototype.data.Request;
import FrontControllerPrototype.enums.ServEnum;
import FrontControllerPrototype.service.CategoryService;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static FrontControllerPrototype.enums.ServEnum.CatService;

public class Test1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CategoryService catserv=new CategoryService();
        buildClassNameMap();
        Request request = new Request("cat", "getCategoryById",111L,0L, 0L);
//        String getTotalCategoryList = (String)MethodHandles.publicLookup().findVirtual(FrontControllerPrototype.service.CategoryService.class,
//                "getCategoryById",
//                MethodType.methodType(String.class, long.class))
//                .invoke(112L);


        Method refl = CategoryService.class.getDeclaredMethod("getTotalCategoryList");
        Method refl1 = CategoryService.class.getDeclaredMethod("getCategoryById",long.class);
        Object invoke = refl.invoke(catserv);
        Object invoke1 = refl1.invoke(catserv, 10L);
        System.out.println(invoke);
        System.out.println(refl1.invoke(catserv, 10L));


    }

    private static void buildClassNameMap() {
        Map<String, Class<?>> enumClassMap = new HashMap();
        for (ServEnum value : ServEnum.values()) {
            enumClassMap.put(value.name, value.className);
        }

        enumClassMap.entrySet().forEach(System.out::println);
    }


}
