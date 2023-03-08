package patterns.builder.vertexsample;

public class TestBuilderVertex {
    public static void main(String[] args) {
        Person newPerson = new Person.Builder()
                .withName("Mykola")
                .withSurname("Smityuk")
                .withHeight(175)
                .build();
        System.out.println(newPerson);

    }

}
