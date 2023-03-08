package mipt_timosha.bruteforce;

public class CheckVeritatis {

    static int getValue(){
        return 0;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c=a|b;
        int z=5;
        int i = -6;
        boolean x = false;
        boolean y = true;
        if(x|y){
            System.out.println("True");
        } else System.out.println("False");




//        a|b
//        if((a&&b)){
//            System.out.println("FFFF");
//        } else System.out.println("LLLLL");
//        System.out.println((a|b));
//        System.out.println(Integer.toBinaryString(-5));
//        System.out.println(Integer.toBinaryString(-5<<2));
        System.out.println(String.format("%32s",Integer.toBinaryString(z)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(i)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(z<<1)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(z<<2)).replace(' ', '0'));
//        System.out.println(Integer.toBinaryString(i));


    }

}
