package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestReflection {
    public static void main(String[]args) throws InvocationTargetException, IllegalAccessException {
        Person person=new Person();
        Class aClass = person.getClass();
        Class bclass= new Person().getClass();
        Class personClass=Person.class;

        Method[] aClassMethods = new Person().getClass().getMethods();
        Map<String,Method>methodsMap=new HashMap();
        for (Method aClassMethod : aClassMethods) {
            methodsMap.put(aClassMethod.getName(),aClassMethod);
        }
        methodsMap.entrySet().forEach(System.out::println);

        for (Method met : aClassMethods) {
            System.out.println(met.getName()+" return type is: "+ met.getReturnType()+"\n\t params are: "+
                     Arrays.toString(met.getParameterTypes()));

        }
        System.out.println("======= Annotations ========");

        Annotation[] ann = new Person().getClass().getAnnotations();
        for (Annotation annot : ann) {
            if(annot instanceof Author){
                System.out.println("Yes, it's annotated with " + annot.toString());
            }else{
                System.out.println("No Annotation");
            }
        }


    }
}
