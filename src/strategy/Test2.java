package strategy;

import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
        ActionRegistry <Runnable>reg= new ActionRegistry();
        Runnable actionFunc = null;


        final DbOperator operator = new DbOperator();
        for (Actions value : Actions.values()) {
            value.sendTo(operator.actions::add);
        }

        Actions.FindAll.sendTo(operator.actions::add);
            Actions.FindOneById.sendTo(operator.actions::add);

//        Формируем переменную из запроса httpRequest
            String actionCommand=Actions.FindAll.name;
        operator.performAll();
//        reg.map.get("FindOneById").run();

        }

    }

