package dataStructures.stack.queu.arkhipov.queue;

public class ArkhipovTest {
    public static void main(String[] args) {
        SimpleQueue<String> sq=new SimpleQueue();
        sq.add("First");
        sq.add("Second");
        sq.add("Third");
        sq.add("fourth");

        System.out.println("Remove "+ sq.remove());
        System.out.println(sq.getList());
        System.out.println("Null index contains "+sq.getList().get(0));
    }

}
