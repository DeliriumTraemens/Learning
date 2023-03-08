package mipt_timosha.bruteforce;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class LimitedLoop {


    static void limitedLoop(int limit, int range) {
        for (int i = 1; i < range; ++i) {
            if (i % limit != 0) {
                System.out.print(i % limit + " ");
                continue;
            } else
                System.out.print(limit + " ");
        }
    }

    static void limitedLoop2(int limit, int range) {
        for (int i = 1; i < range; ++i) {
            if ((i % limit) != 0) {
                System.out.print(i % limit + " ");
            } else {
                System.out.print(limit + " ");
            }

        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        boolean x1 = true;
        boolean x2 = true;
        limitedLoop(12, 60);
        System.out.println("\n===");
        System.out.println((a | b));
        System.out.println("\nleft shift");
        System.out.println((Integer.toBinaryString(a) ));
        System.out.println((Integer.toBinaryString(a<<4) ));
        System.out.println("\n=====--boolean---=====");
        System.out.println(x1 ^ x2);
        System.out.println("\n---------===============------------");
        byte octet = 5;
        String bin = String.format("%8s", Integer.toBinaryString(octet)).replace(' ', '0');
        System.out.println(bin);
        System.out.println("\n---------===============------------");
        byte data = 0b00000001;
        System.out.println(data);
        System.out.println(String.format("%16s", Integer.toBinaryString(data)).replace(' ', '0'));

        System.out.println("\n---------===============------------\n");
        for (int i=1; i<8; i++) {
            System.out.println(String.format("%16s", Integer.toBinaryString(data<<(i%4))).replace(' ', 'x'));
        }
        System.out.println("-----------");
        boolean bool =false;
        System.out.println(bool);

//        String[] arr1 = new String[]{
//                "a", "b", "c", "d", "e"
//        };
//        String[] arr2 = new String[12];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = arr1[i % arr1.length];
//        }
//        System.out.println(Arrays.toString(arr2));

    }

}
