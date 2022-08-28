package strategy;

import java.util.concurrent.ConcurrentSkipListMap;

public class ActionRegistry <T> {

    public ConcurrentSkipListMap<String, T> map = new ConcurrentSkipListMap<>();

    public void add(final String actionName, final T actionFunc){
        map.put(actionName, actionFunc);
    }

    public T get(final String actionName){
        return map.get(actionName);
    }

    public void replace(final String actionName, final T actionFunc){
        map.put(actionName, actionFunc);
    }

    public void remove(final String actionName){
        map.remove(actionName);
    }

}
