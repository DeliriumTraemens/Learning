package FrontControllerPrototype.util;

import java.util.ArrayList;
import java.util.List;

public class MapTestMaker {
    public  String a="Hello ";
    public   String b="Here ";
    public   String c="And There";
    public   String d="And For All";
    public  List<String> itaratorList=new ArrayList<>();
    public  List <String> makeList(){
        itaratorList.add(a);
        itaratorList.add(b);
        itaratorList.add(c);
        itaratorList.add(d);
        return itaratorList;
    }
}
