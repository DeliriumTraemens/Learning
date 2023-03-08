package arkhipov.algorithmes.commondividers;

public class GcdEuclide {

    static int euclide(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

//    static int euclideVar(int a, int b) {
//        loop_begin:
//            if (a==b) goto loop_end;
//            if (!(a > b)) goto else_action;
//                a -= b;
//                goto after_if;
//                else_action:
//                b -= a;
//                after_if:
//                goto loop_bein;
//                loop_end:
//                    return a;
//            }
//        }
//        return a;
//    }

    public static void main(String[] args) {
        System.out.println("Greatest Common Divider is " + euclide(256, 128));

    }

}
