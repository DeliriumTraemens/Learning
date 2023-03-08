package dataStructures.stack.queu.arkhipov.byteoperation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ByteOperation {
    public static void main(String[] args) {
        System.out.println("0 XOR 0 = " + (0^0));
        System.out.println("0 XOR 1 = "+(0^1));
        System.out.println("1 XOR 0 = "+(1^0));
        System.out.println("1 XOR 1 = " +(1^1));

        System.out.println("\n=========\n");

        System.out.println("0 && 0 = " + (0&0));
        System.out.println("0 && 1 = "+(0&1));
        System.out.println("1 && 0 = "+(1&0));
        System.out.println("1 && 1 = " +(1&1));

        System.out.println("\n=========\n");

        System.out.println("0 | 0 = " + (0|0));
        System.out.println("0 | 1 = "+  (0|1));
        System.out.println("1 | 0 = "+  (1|0));
        System.out.println("1 | 1 = " + (1|1));

        System.out.println("\n=========\n");

        System.out.println("0 >> 0 = " + (0>>0));
        System.out.println("0 >> 1 = "+(0>>1));
        System.out.println("1 >> 0 = "+(1>>0));
        System.out.println("1 >> 1 = " +(1>>1));
    }
}
