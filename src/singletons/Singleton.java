package singletons;

import java.io.Serializable;

public class Singleton implements Serializable {
    public static final Singleton  INSTANCE = new Singleton();
    private int value;
    private Singleton(){

    }
    public int getValue() {
        return this.value;
    }
    public void setValue(int value) {
        this.value=value;
    }
    protected Object readResolve() {
        return INSTANCE;
    }

}
