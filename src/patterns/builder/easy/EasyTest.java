package patterns.builder.easy;

import org.openjdk.jol.info.ClassLayout;

public class EasyTest {
     private Product product;

    public static void main(String[] args) {
        Product product1 = new Product()
                .setName("Pollitr")
                .setDescription("Something liquid")
                .setPrice(410)
                .setArtikul(1236);

        String prs1 = product1.toString();
        System.out.println(product1);
        System.out.println("prs1 - \n" + prs1);

        Dummy dummy = new Dummy();
        System.out.println("Class Layout Product1.instance\n"+ClassLayout.parseInstance(product1).toPrintable());
        System.out.println("=============\nClass Layout parseClass Dummy.class\n"+ClassLayout.parseClass(Dummy.class).toPrintable());

//        ClassLayout classLayout = ClassLayout.parseClass(Product.class);
//        System.out.println("Class Layout parseClass(Product.class)\n"+classLayout.toPrintable());
        System.out.println("Class parseInstance (new Product())\n"+ClassLayout.parseInstance(new Product()).toPrintable());
        System.out.println("Class parseInstance (Product())\n"+ClassLayout.parseInstance(Product.class).toPrintable());
    }

}
