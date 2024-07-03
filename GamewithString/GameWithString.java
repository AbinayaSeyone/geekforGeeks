package GamewithString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class GameWithString
{
    public static void main( String[] args )
    {
        String s = "abccc";
        int k = 1;
        GameWithStringTest x=new GameWithStringTest();
        System.out.println( "x = " + x.minValue( s,k ) );
    }
}

class GameWithStringTest{
    int minValue(String s, int k){

        List<Character> charList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            charList.add(c);
        }

        // Sort the list alphabetically
        Collections.sort(charList);
        //List<Character> subList = charList.subList(0, charList.size());


        int minValueHat=0;
        ArrayList<Integer> arr =new ArrayList<>();
        int maxCount=0;
        for( int i=0;i<charList.size();i++ ){
            int count=0;
            for(int j=i;j<charList.size();j++){
                if(charList.get(i).equals(charList.get( j ))){
                    count++;
                    if(count>1){
                        i++;
                    }
                }

            }
            arr.add( count );
            //minValueHat+=count*count;

        }
       for(int i=0;i<k;i++){
           int maxElement = Collections.max(arr);

           // Reduce the value of the maximum element by one
           arr.set(arr.indexOf(maxElement), maxElement - 1);
       }

       for(int num: arr){
           minValueHat+=num*num;
       }
        return minValueHat;

    }
}
