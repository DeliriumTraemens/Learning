package interfaces.models;

import interfaces.interf.Flyable;
import interfaces.interf.Speakable;

public class Dog implements Flyable, Speakable {
    private int id;
    private String name;

    @Override
    public void fly() {
        System.out.println("Hey, I'm a Dog, I can't FLYYY");
    }

    @Override
    public void speak() {
        System.out.println("Wufff");
    }

    //Cons

    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //G\S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //ToStr

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
