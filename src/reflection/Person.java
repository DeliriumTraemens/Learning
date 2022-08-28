package reflection;

@Author(name = "name", dateOfBirth = 12)
public class Person {
    private int id;
    private String name;

    public void sayHello() {
        System.out.println("Person with id " + id + " and name " + name + " says HELLO");
    }
     public void sayHi(){
         System.out.println("Hi!!!");
     }

//    public void saySomething(String someThing){
//        System.out.println(someThing);
//    }

    public Person() {
        this.id=1;
        this.name="Nick";
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

