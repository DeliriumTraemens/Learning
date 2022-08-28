package funcInterf;

public class FuncIf1 {
    public static void main(String[] args) {
        Iface ifac = (n)->(n%2)==0;
        System.out.println("Func1+++++++++++");
        System.out.println( ifac.func(2048) );

        EvenCheck echeck=(x, y)->(x%y)==0;
        System.out.println("EventCheck1===========");
        System.out.println(echeck.check(30,14));

    }


}



@FunctionalInterface
interface Iface{
    boolean func(int i);
}
@FunctionalInterface
interface EvenCheck {
    boolean check(int i, int j);
}
