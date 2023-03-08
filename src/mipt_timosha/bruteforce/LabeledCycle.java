package mipt_timosha.bruteforce;

public class LabeledCycle {
    static int a =1;
    static void ifLoop(){
        if(a<=5){
            System.out.print(a +" ");
            a++;
            ifLoop();
        } else
        System.out.print(" Wyshel Zaychik poguljatj");
    }

    public static void main(String[] args) {
//        int x = 1;
//        looplabel:
//        {
//            if (x < 5) {
//                System.out.println(x);
//                x++;
//                break looplabel;
//            }
//        }
        ifLoop();
//       System.out.println("Wyshel Zaychik poguljatj");
    }

}
