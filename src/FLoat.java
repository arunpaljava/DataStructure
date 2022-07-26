import java.util.Map;
import java.util.TreeMap;

public class FLoat {
    public static void main(String s[]){
        Map<Integer,String> map = new TreeMap<>();
        map.put(null,"");
        try {
          int x=0;
          for(x=1;x<4;x++)
              System.out.println(x);
        }catch (Exception e){
        }finally {
            System.out.println("Error");
        }
    }

    private static int doStug(String[] s) {
        return Integer.parseInt(s[0]);
    }
}
