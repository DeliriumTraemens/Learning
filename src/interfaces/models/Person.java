package interfaces.models;

import interfaces.interf.Flyable;
import interfaces.interf.Speakable;

public class Person implements Flyable, Speakable {
    private int id;
    private String name;

//    @Override
    public void fly() {
        System.out.println("Я "+ getName()+ ", я летаю!!!");
    }

//    @Override
    public void speak() {
        System.out.println("Привет, я " + getName()+"!");
    }

    public void innerMethod(){
        System.out.println("It's the Inner Method of this class");
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
    //ToString

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
