package dataStructures.stack.queu.arkhipov.stack;

import java.util.ArrayList;

public class TestStack {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0,"First");
        list.add(0,"Second");
        System.out.println("Now list is"+ list);
        list.add(0,"Third");
        list.add(0,"Fourth");
        list.add(0,"Fifth");
        list.add(0,"Sixth");
        System.out.println(list);
        System.out.println("We remove "+list.remove(0));
        System.out.println("Now list is"+ list);
        System.out.println("We remove "+list.remove(0));
        System.out.println("Now list is"+ list);
    }

}
