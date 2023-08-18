package generics.model;

public class Cat extends Animal {
    public String name;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("Meooow");
    }

    @Override
    public void eat() {
        System.out.println("Nyamnyam");
    }
}
