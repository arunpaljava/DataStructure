package DesignPatteren;
public class SingleTonClient {
    public static void main(String args []){

        SingleTon singleTon = SingleTon.INSTANCE;
        singleTon.setValue(20);
        System.out.println(singleTon.getValue());
    }
}
