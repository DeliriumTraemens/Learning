package generics.model;

import generics.ifaces.AnimalBehaviors;

public abstract class Animal implements AnimalBehaviors {
    public int id;

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
