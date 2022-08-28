package annotations;
@MethodInfo(purpose = "Annatate Class")
public class Test {

    @MethodInfo(author = "Nick", dateOfCreation = 1212, purpose = "Print Hello World")
    public void printHelloWorld() {
        System.out.println("Hello World");
    }

    @MethodMarker(name="doFirst")
    public void doFirst(){
        System.out.println("do First");
    }
}
