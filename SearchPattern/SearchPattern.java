package SearchPattern;

import java.util.ArrayList;

public class SearchPattern
{
    public static void main( String[] args )
    {

    }
}

class SearchPatternTest{
    ArrayList<Integer> search( String pattern, String text)
    {

        ArrayList<Integer>  finalList=new ArrayList<>();
        String test;
        test="";
       for(int i=0;i<text.length();i++){


           test+=text.charAt( i );
           if(test.equals( pattern )){
               finalList.add( i+1-pattern.length() );
           }
       }
       return  finalList;
    }
}
