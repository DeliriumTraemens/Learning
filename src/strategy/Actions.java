package strategy;

import java.util.function.BiConsumer;

public enum Actions {
    FindAll("FindAll", ()-> System.out.println("SELECT * FROM items")),
    FindOneById("FindOneById", ()-> System.out.println("SELECT id, name FROM items WHERE id=?")),
    FindOneByName("FindOneByName", ()-> System.out.println("SELECT id, name FROM items WHERE name=?")),
    UpdateElement("UpdateElement", ()-> System.out.println("INSERT  INTO items (id, name) VALUES (1,'Bob') WHERE id=?")),
    DoSomething("SomeThing", DbOperator::doSomething)
    ;

    public String name;
    public Runnable func;

    private Actions(final String m_name, final Runnable m_func){
        this.name= m_name;
        this.func = m_func;
    }

    public void sendTo(final BiConsumer<String, Runnable> someApiFunction){
        someApiFunction.accept(this.name, this.func);
    }

    public void sendTo(final BiConsumer<String, Runnable> someApiFunction, final Runnable m_func){
        someApiFunction.accept(this.name, m_func);
    }
}
