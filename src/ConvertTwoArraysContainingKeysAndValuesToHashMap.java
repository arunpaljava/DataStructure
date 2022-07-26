import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertTwoArraysContainingKeysAndValuesToHashMap {



    public static void main(String s[]){
        String[] shortNames = {"SUN", "MON", "TUE","WED","THU","FRI", "SAT"};

        // days long name
        String[] longNames = {"SUNDAY", "MONDAY", "TUESDAY","WEDNESDAY","THURSDAY","FRIDAY", "SATURDAY"};
        Map<String,String> day = IntStream.range(0,shortNames.length).boxed().collect(Collectors.toMap(i -> shortNames[i],i -> longNames[i]));
        List<String> list = day.keySet().stream().collect(Collectors.toList());
        day.entrySet().parallelStream().forEach(enrty -> System.out.println(enrty.getKey()+","+enrty.getValue()));

        Map<String,String> map = IntStream.range(0,shortNames.length).boxed().collect(Collectors.toMap(i-> shortNames[i],i->longNames[i]));
        map.keySet().parallelStream().collect(Collectors.toList());
        map.entrySet().stream().forEach(enty-> System.out.println(enty.getKey()+", "+ enty.getValue()));
        //IntStream.range(0,shortNames.length).collect(Collectors.toMap(i -> shortNames[i], i-> longNames[i]));
    }
}
