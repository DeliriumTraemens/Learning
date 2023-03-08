package mipt_timosha.bruteforce;

public class ModuleDivider {
    static void moduleDivider(int x, int divider) {
        int justIntedDivision = x / divider;
        int intermediateResult = justIntedDivision * divider;
        int manualRest = x - intermediateResult;

        int moduleDivision = x % divider;


        System.out.println("X " + x + " divided by Divider " + divider + " is " + justIntedDivision);
        System.out.println("Intermediate result of division x "+x+" by divider " + divider+" is " +intermediateResult);
        System.out.println("Manual Rest of X "+x+" and intermediateResult " +intermediateResult+" is "+ manualRest);
        System.out.println("===%===");
        System.out.println("X " + x + " divided by Module Divider " + divider + " is " + x % divider);
    }

    public static void main(String[] args) {
        moduleDivider(17, 5);
    }

}
