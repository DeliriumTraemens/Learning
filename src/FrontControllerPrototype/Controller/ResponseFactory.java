package FrontControllerPrototype.Controller;

import FrontControllerPrototype.data.Request;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ResponseFactory {
    static String responseBuilder(Request req) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> classReflObj = ClassNameMapBuilder.enumClassMap.get(req.getServiceName());

        return getMethodToInvoke(req).invoke(classReflObj.newInstance()).toString();

//        Method methodToInvoke = getMethodToInvoke(req);
//        Object objToInvoke = classReflObj.newInstance();
//        return methodToInvoke.invoke(classReflObj.newInstance()).toString();
//        return methodToInvoke.invoke(objToInvoke).toString();
    }

    static Method getMethodToInvoke(Request req) throws NoSuchMethodException {
        return ClassNameMapBuilder.enumClassMap.get(req.getServiceName()).getDeclaredMethod(req.getMethodName());
    }
}