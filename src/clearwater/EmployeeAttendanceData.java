package clearwater;
import java.util.ArrayList;
import java.util.List;

public class EmployeeAttendanceData {
    public static void main(String s[]) {
        int m = 2;
        List<String> data = new ArrayList<>();
        data.add("NN");
        data.add("YY");
        data.add("YY");
        data.add("YN");
        data.add("YY");
        System.out.println("\nAnswer " + maxStreak(m, data));
    }

    public static int maxStreak(int m, List<String> data) {
        int ans=0;
        int flag=1;
        for(int i=0;i<data.size();i++){
            flag=0;
            for(int j=0;j<data.get(i).length();j++){
                if(data.get(i).charAt(j)=='N'){
                   flag=1;
                    break;
                }
            }
            if(flag==0){
                ans++;
            }
        }
        return ans;
    }
}

/*
* SELECT s.STUDENT_NAME,m.MAJOR_NAME from STUDENT s,
* JOIN REGISTER r ON r.STUDENT_ID = s.STUDENT_ID
* JOIN MAJOR m ON m.MAJOR_ID = r.MAJOR_ID LIMIT 20;
* */