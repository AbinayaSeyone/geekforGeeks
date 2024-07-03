package WordBreakOriginalCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Solution
{
    public static void main( String[] args )
    {
        int n=4;
        String s="samsamsung";

        String[] arr = { "sam", "aamsung"};

        ArrayList<String> sample = new ArrayList<>( Arrays.asList(arr));
        Solution17 test=new Solution17();
        int result=test.wordBreak1( 2,s,sample );
        System.out.println( "result = " + result );

    }
}


class Solution17{
//Back-end complete function Template for Java



        public  int wordBreak1(int n, String s, ArrayList<String> dictionary )
        {
            //initialize variables
            int i,j,k;

            //create a TreeSet to store the words in dictionary
            TreeSet<String> mp = new TreeSet<>();

            //add all words from dictionary to the TreeSet
            for(i=0;i<n;i++)
                mp.add(dictionary.get(i));

            System.out.println(mp);

            int len = s.length();

            //create a dynamic programming array to store if a substring can be broken into words
            ArrayList<Boolean> dp = new ArrayList<Boolean>(len + 1);

            //initialize dp array with false values
            for(i=0;i<len;i++)
                dp.add(i,false);

            //initialize the first index of the dp array as true
            dp.add(0,true);

            //iterate through each index of the string
            for(i = 1; i <= len; i++) {
                for(j = 0; j <=i; j++) {
                    //check if substring from index j to i is present in dictionary
                    if(dp.get(j)  && mp.contains(s.substring(j, i))) {
                        //if yes, set the dp value at index i as true and break the loop
                        dp.add(i,true);
                        break;
                    }
                }
            }

            //check if the last index of dp array is true, if yes return 1
            if(dp.get(len))
                return 1;

            //if not, return 0
            return 0;

        }


}
