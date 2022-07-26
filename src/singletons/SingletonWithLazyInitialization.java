package singletons;

public class SingletonWithLazyInitialization {
    private static SingletonWithLazyInitialization  INSTANCE;
    private SingletonWithLazyInitialization(){

    }
    public static SingletonWithLazyInitialization getInstance(){
        if(null==INSTANCE){
            synchronized (SingletonWithLazyInitialization.class){
                if(null==INSTANCE){
                    INSTANCE = new SingletonWithLazyInitialization();
                }
            }
        }
        return INSTANCE;
    }
}
