package singletons;

public class TraditionalMethodsOfMakingSingletons {
    private static final TraditionalMethodsOfMakingSingletons  INSTANCE = new TraditionalMethodsOfMakingSingletons();
    private TraditionalMethodsOfMakingSingletons(){

    }
    public static TraditionalMethodsOfMakingSingletons getInstance(){
        return INSTANCE;
    }
}
