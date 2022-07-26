package twilio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SMSCompliantSegment {

    public static void main(String s[]){
        String str= "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus";
        List<String> listOfsegments = segments(str);
        for (String seg : listOfsegments){
            System.out.println(seg);
        }

    }

    public static List<String> segments(String message) {

        if(message.length()<160) {
            return Stream.of(message).collect(Collectors.toList());
        }

        List<String> result = new ArrayList<>();
        int maximumLength = 154; //i need to add (1/5)
        int startingPosition = 0;
        int endingPosition = startingPosition+maximumLength;
        int messageLength = message.length();

        while ( endingPosition < messageLength ){
            if(message.charAt(endingPosition)!=' '){
                int newEndingPosition = message.substring(0,endingPosition).lastIndexOf(' ');
                if(newEndingPosition>startingPosition)
                    endingPosition = newEndingPosition;

            }

            result.add(message.substring(startingPosition,endingPosition+1));
            startingPosition = endingPosition+1;
            endingPosition = startingPosition + maximumLength;

        }

        result.add( message.substring(startingPosition,messageLength));
        int count=1;
        final int resultsSize = result.size();
        List<String> answer = new ArrayList<>(resultsSize);
        for(int pos =0;pos<resultsSize;pos++){
            answer.add(result.get(pos) + "(" +count +"/"+resultsSize+")");
            count++;
        }
        //result.stream().map(s -> s+ "(" +counter.incrementAndGet() +"/"+resultsSize+")").collect(Collectors.toList());
        //.map(s -> s+ "(" +counter.incrementAndGet() +"/"+resultsSize+")")                       .collect(Collectors.toList());

        return answer;

    }


}
