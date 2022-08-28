package funcInterf;

import interfaces.interf.Flyable;
import interfaces.models.Dog;

import java.util.function.Consumer;

@FunctionalInterface
interface StringAct{
    String func(String n);
}

public class Test2 {
    static String stringOp(StringAct f, String val){
        return f.func(val);
    }
    static String getResultString(String val) {
        return stringOp((d)-> d.toUpperCase(), val);
    }

    public static void main(String[] args) {

        Flyable dogFido = new Dog(1, "Fido");
        System.out.println(dogFido.getClass().toString());
        Dog fido2 = new Dog(2, "Fuddo");
        System.out.println(fido2.getName());
       fido2.speak();

       Consumer<String> cons1 = System.out::println;
       cons1.accept("cons1");
    }




}




