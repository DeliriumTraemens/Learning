package strategy;

public class DbOperator {
    protected ActionRegistry<Runnable> actions = new ActionRegistry<>();

//    Извлечь из мапы элемент по имени, и запустить его
    public  void perform(final String actionName){
        actions.get(actionName).run();
    }


//    АХТУНГ!! perform БЕЗ СКОБОК!!!
    public void performAll(){
        actions.map.descendingKeySet().forEach(this::perform);
    }

    public static void doSomething(){
        System.out.println("Something");
    }
}

