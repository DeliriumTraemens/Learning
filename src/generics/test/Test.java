package generics.test;

import generics.ifaces.AnimalBehaviors;
import generics.model.Animal;
import generics.model.Cat;
import generics.model.Dog;
import generics.model.Kitten;

import java.util.ArrayList;
import java.util.List;

public class Test {
    Animal zver;

    public static void main(String[] args) {
        AnimalBehaviors animal = new Dog();
//        animal.id = 10;
        Animal pes = new Dog();
        pes.id = 7;
        Dog barbos = new Dog();
        barbos.id = 5;
        barbos.name = "Fido";
        Cat murka = new Cat();
        murka.name = "Kisa";
        Kitten murzik = new Kitten();
        murzik.id = 8;
        murzik.age = 3;
        murzik.name = "Barsik";
        List<Animal> petList = new ArrayList();
        petList.add(barbos);
        petList.add(pes);
//        petList.add(animal);
        petList.add(murka);
        petList.add(murzik);

        petList.forEach(System.out::println);
        petList.forEach(t -> {
            t.eat();
            t.voice();
        });

    }
}
