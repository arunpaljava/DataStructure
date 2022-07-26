public class ClassCastExp {


    public static void main(String s[]){
            String x= "Arun";
            Integer val = Integer.valueOf(x);

            AA a = new AA();
            BB aa = (BB)a;

       // BB b = new BB();
    }
}



class AA{
    AA(){
        System.out.println("A");
    }

}

class BB extends AA{
    BB(){
        System.out.println("A");
    }

}

class CC extends AA{
    CC(){
        System.out.println("A");
    }

}
