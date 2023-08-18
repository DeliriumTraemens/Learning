package generics.model;

import generics.ifaces.AnimalBehaviors;

public abstract class Animal implements AnimalBehaviors {
    public int id;
    public String type="Abstract animal";

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
