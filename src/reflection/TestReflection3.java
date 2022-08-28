package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class p1 = Person.class;
        String metName = "sayHi";
        String met2 = "sayHello";


        Method m1 = p1.getMethod(metName);
        m1.invoke(p1.newInstance());
        System.out.println("=============");
        p1.getMethod(met2).invoke(p1.newInstance());
    }
}
