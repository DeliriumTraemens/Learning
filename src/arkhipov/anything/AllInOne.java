package arkhipov.anything;

public class AllInOne {
    public static void main(String[] args) {
        byte byteVal = (byte) 0xFC;
        System.out.println(byteVal);
        System.out.println(Integer.toBinaryString( byteVal));
        System.out.println(Integer.bitCount( byteVal));

        int intVal = 0xff & byteVal;
        System.out.println(intVal);
        System.out.println("==========");
        System.out.println((byte) 257);
    }
}
