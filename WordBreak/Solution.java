package WordBreak;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main( String[] args )
    {
        int n=4;
        String s="qycjcdlgappppbmcxppbpbmcxppqycjcdlga";

        String[] arr = { "b", "qycjcdlga", "pbmcx", "p"};
        
        ArrayList<String> sample = new ArrayList<>( Arrays.asList(arr));
        Solution1 test=new Solution1();
        int result=test.wordBreak( 4,s,sample );
        System.out.println( "result = " + result );
        
    }
}

class Solution1
{
    public  int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        ArrayList<String> arrayInOrder=new ArrayList<>();

            for(int j=0;j< dictionary.size();j++)
            {
                for( int k = 0; k < dictionary.size() - j-1; k++ )
                {
                    if( dictionary.get( k + 1 ).length() >= dictionary.get( k ).length() )
                    {
                        String temp;
                        temp = dictionary.get( k );
                        dictionary.set(k, dictionary.get(k+1) );
                        dictionary.set( k+1,temp );
//                        arrayInOrder.add( k, dictionary.get( k + 1 ) );
//                        arrayInOrder.add( k + 1, temp );
                    }
//                    else{
//                        arrayInOrder.add(k, dictionary.get(k) );
//                        arrayInOrder.add( k+1, dictionary.get(k+1) );
//                    }
                }
                
            }
            
            for(String eachWord:dictionary){
                System.out.println( "eachWord = " + eachWord );
            }

        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            resultString.append(letter);
            for(String word1:dictionary){
                if(resultString.toString().equals(word1)){
                    if(i==s.length()-1){
                        System.out.println(resultString);
                        return 1;
                    }
                    else{
                        resultString.setLength(0);
                        break;
                    }
                }
            }
//            if(i==s.length()-1){
//                i=i-resultString.length();
//
//            }
        }


        return  0;
    }
}
