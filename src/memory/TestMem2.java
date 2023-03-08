package memory;

public class TestMem2 {
    public static void main(String[] args) {

        BuildTest test = new BuildTest();
        String firstEl = "First El";
        String secondEl = "Second Element";
        String thirdEl = "Third Element";
        int a = secondEl.hashCode();
        String [] elements ={secondEl, firstEl,  thirdEl, "Fourth El String"};

        String testArray[] = {"10", "5", "89"};

        int length = testArray.length;

        for (int i=0;i<4;i++) {
            System.out.println(elements[i]);
        }
    }

}

class BuildTest{
    private String name;
    private String family;

    public BuildTest() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public  BuildTest build(){
        return new BuildTest();
    }
}
