package generics.model;

import generics.ifaces.AnimalBehaviors;

public class Kitten extends Cat {
    public int age;
    AnimalBehaviors behavior;

    @Override
    public void voice() {
        System.out.println("Miiiiiiiow");;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Lizzzzzyyyy");
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
