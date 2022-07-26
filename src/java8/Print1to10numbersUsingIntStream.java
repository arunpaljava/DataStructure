package java8;
import java.util.stream.IntStream;

public class Print1to10numbersUsingIntStream {

    public static void main(String s[]){

        IntStream.range(1,11).forEach(num->System.out.println(num));
    }
}
