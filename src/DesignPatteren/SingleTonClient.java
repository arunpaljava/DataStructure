package DesignPatteren;
public class SingleTonClient {
    public static void main(){
        SingleTon singleTon = SingleTon.INSTANCE;
        System.out.println(singleTon);
    }
}
