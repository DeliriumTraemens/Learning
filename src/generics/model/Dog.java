package generics.model;

public class Dog extends Animal {
    public String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Wwoof");
    }

    @Override
    public void eat() {
        System.out.println("Hrrrumm");
    }
}
