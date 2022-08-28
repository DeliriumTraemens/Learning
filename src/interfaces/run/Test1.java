package interfaces.run;

import interfaces.interf.Flyable;
import interfaces.interf.Speakable;
import interfaces.models.Dog;
import interfaces.models.Person;

public class Test1 {
    public static void main(String[] args) {
        Flyable flyingMan = new Person(1,"Bob");
        Speakable speakingMan = new Person(2,"Marley");
        Speakable speakingDog = new Dog(1, "Fido");
        Flyable flyingDog = new Dog(1,"Fido2");
        Object per1 = new Person(2, "Sam");
        System.out.println("per1 " +per1.toString());
        flyingMan.fly();
        speakingMan.speak();

        System.out.println("=============");
        speakingDog.speak();
        flyingDog.fly();
        System.out.println("=============");

        System.out.println(new Person(3,"Marcey").toString());
        aaa(3,"Grey");
    }

    private static void aaa(int id, String name) {
        new Person(id,name).speak();
    }
}
