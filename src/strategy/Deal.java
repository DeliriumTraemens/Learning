package strategy;

import java.util.function.Consumer;

public enum Deal {
    DOIT("Do", System.out::println),
    ELSEDO("Else", (a)->System.out.println(a));

    public String name;
    public Consumer func;

    Deal(String name, Consumer func) {
        this.name = name;
        this.func = func;
    }
}
