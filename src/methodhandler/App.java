package methodhandler;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Throwable {
        System.out.println("==== Direct invoke ====");
        steps(System.nanoTime());
//        Reflection
        System.out.println("==== REFLECTION ====");
        Method reflect = App.class.getDeclaredMethod("steps", long.class);
        reflect.setAccessible(true);
        reflect.invoke(null, System.nanoTime());
        System.out.println("direct reflect Invoke");
        App.class.getDeclaredMethod("steps", long.class).invoke(null, System.nanoTime());

        //    MethodHandles
        System.out.println("==== Method Handles ====");
//      На объекте хендлера сначала вызываем Лукап,(их несколько видов), потом один из видов Файнд, и потом завершаем
//        цепочку вызовом - вызовов тоже несколько
        MethodHandles.publicLookup()
                .findStatic(App.class, "steps", MethodType.methodType(void.class, long.class))
                .invoke(System.nanoTime());

//        MethodHandless full cycle
        String metName="steps";
        MethodType mt= MethodType.methodType(void.class, long.class);
        MethodHandles.Lookup publicLookup = MethodHandles.publicLookup();
//Achtung - The Type Is CHANGED!!
        MethodHandle metHandle = publicLookup.findStatic(App.class, metName, mt);
        System.out.println("======= Met Handle 3 =======");
        metHandle.invoke(System.nanoTime());




    }//mainEnd

    public static void steps(long startTime) {
        ArrayList<Double> ints = new ArrayList<>();
//        безымянный объект Рандома, генерящий поток цыфр, через форИч пихуемый в ранеесозданный Лист
        new Random(1).doubles(1000).forEach(ints::add);
        System.out.println("End " + (System.nanoTime() - startTime)  + " sec");
    }
}
