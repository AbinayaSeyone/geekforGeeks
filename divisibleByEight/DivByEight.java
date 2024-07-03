package divisibleByEight;

import java.math.BigInteger;

public class DivByEight
{
    public static void main( String[] args )
    {
        DivByEightFunction obj=new DivByEightFunction();
        System.out.println(obj.DivisibleByEight( "54141111648421214584416464555" ));;
    }

}

class DivByEightFunction{
    int DivisibleByEight(String s){
//       if(Integer.parseInt(s)%8==0){
//           return 1;
//       }
//       else {
//           return -1;
//       }
        int length = s.length();
        if (length < 3) {
            return Integer.parseInt(s) % 8 == 0 ? 1 : -1;
        } else {
            String lastThreeDigits = s.substring(length - 3);
            int lastThreeDigitsValue = Integer.parseInt(lastThreeDigits);
            return lastThreeDigitsValue % 8 == 0 ? 1 : -1;
        }
    }
}
