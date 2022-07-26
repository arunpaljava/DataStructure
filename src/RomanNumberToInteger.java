public class RomanNumberToInteger {

    public static void main(String s[]){
        System.out.println("Test....|");
        String roman = "IV";
        int number = new RomanNumberToInteger().romanToInteger(roman);
        System.out.println(roman +" to Integer...."+number);
    }

    private int romanToInteger(String romanStr){
        int res = 0;
        for(int i=0;i<romanStr.length();i++){
            int num1 = getValues(romanStr.charAt(i));
            if(i+1<romanStr.length()){
                int num2 = getValues(romanStr.charAt(i+1));
                if(num1>=num2){
                    res = res+num1;
                } else {
                    res = res+num2-num1;
                    i++;
                }
            } else {
              res = res+num1;
            }
        }
        return res;
    }

    private int getValues(char ch){
        if(ch=='I')
            return 1;
        else if(ch=='V')
            return 5;
        else if(ch=='X')
            return 10;
        else if(ch=='L')
            return 50;
        else if(ch=='C')
            return 100;
        else if(ch=='D')
            return 500;
        else if(ch=='M')
            return 1000;
        return -1;
    }
}
