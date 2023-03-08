package dataStructures.stack.queu.arkhipov.byteoperation;

public class ByteOp1 {
    public static void main(String[] args) {
        int i = 0b00001000;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
//        printBinary(8);
        System.out.println("===>>><<<===\n");
        System.out.println("---побитовый сдвиг вправо---");
        System.out.println("в десятичном виде: " + (i >> 2));
        System.out.println("в двоичном виде: " + binaryStr(i >> 2));
        System.out.println("===>>><<<===\n");

        System.out.println("---побитовый сдвиг влево---");
        System.out.println("в десятичном виде: " + (i << 2));
        System.out.println("в двоичном виде: " + binaryStr(i << 2));
//        binaryStr(5);
    }

    // функции для вывода разрядов байта в форматированном виде
    public static void printBinary(int b) {
        System.out.println("0b_" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1));
    }

    public static String binaryStr(int b) {
        return "0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1);
    }

}
