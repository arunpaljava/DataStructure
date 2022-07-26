package singletons;

public class TestClient {
    public static void main(String args[]){
        //1. Traditional Methods of Making Singletons Testing
        for(int i=0;i<10;i++){
            System.out.println(TraditionalMethodsOfMakingSingletons.getInstance());
        }
        //2. Singleton With Lazy Initialization
        for(int i=0;i<10;i++){
            System.out.println(SingletonWithLazyInitialization.getInstance());
        }
    }
}
