package FrontControllerPrototype.Controller;

import FrontControllerPrototype.data.Request;
import FrontControllerPrototype.enums.ServEnum;
import FrontControllerPrototype.service.CategoryService;
//import com.sun.xml.internal.bind.v2.TODO;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static FrontControllerPrototype.enums.ServEnum.CatService;

public class Test1 {
        static Map<String, Class<?>> enumClassMap = new HashMap();
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        CategoryService catserv=new CategoryService();

        buildClassNameMap();
//         add to Request setters for params - long etc
        Request request = new Request("cat", "getTotalCategoryList",111L,0L, 0L);
//        String getTotalCategoryList = (String)MethodHandles.publicLookup().findVirtual(FrontControllerPrototype.service.CategoryService.class,
//                "getCategoryById",
//                MethodType.methodType(String.class, long.class))
//                .invoke(112L);


        System.out.println("======\\MAP/=======");
        Method refl2=enumClassMap.get(request.getServiceName()).getDeclaredMethod(request.getMethodName());
        Class<?> classReflObj = enumClassMap.get(request.getServiceName());
        Object objToInvoke = classReflObj.newInstance();
        System.out.println((refl2.invoke(objToInvoke)));
        System.out.println("======\\MAP\\/=======");

        Method refl = CategoryService.class.getDeclaredMethod("getTotalCategoryList");
        Method refl1 = CategoryService.class.getDeclaredMethod("getCategoryById",long.class);
        Object invoke = refl.invoke(catserv);
        Object invoke1 = refl1.invoke(catserv, 10L);
        System.out.println(invoke);
        System.out.println(refl1.invoke(catserv, 10L));


    }

    private static void buildClassNameMap() {
        for (ServEnum value : ServEnum.values()) {
            enumClassMap.put(value.name, value.className);
        }

        enumClassMap.entrySet().forEach(System.out::println);
    }


}
