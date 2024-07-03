package PowerSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionPowerSet
{
    public static void main( String[] args )
    {
        String s="abcd";
        SolutionPowerSetTest obj=new SolutionPowerSetTest();
        System.out.println(obj.AllPossibleStrings( s ));

    }
}

class SolutionPowerSetTest{
    public List<String> AllPossibleStrings( String s)
    {
        List<String> newList=new ArrayList<>();

        for(int i=0;i<s.length()+1;i++){
            for(int j=0;j<i;j++){
                String se=s.substring( j,i );
                newList.add( s.substring( j,i) );
                String newWord= String.valueOf( s.charAt( j ) );
                int count=-1;
                while(j!=i&& j+1!=i){
                    String updatedSubstring =s.substring( 0,j )+ s.substring(j + 1, i); // Concatenate substrings before and after index j+1
                    newList.add(updatedSubstring); // Add updated substring to newList
                    j++;
                    count++;
                }
                j-=count;

//                int count1=0;
//                while (j < i) {
//                    String after = se.substring(i); // Get substring after index i
//                    String updatedSubstring = se.substring(0, j) + after; // Concatenate substrings
//                    System.out.println(updatedSubstring); // Output the updated substring
//                    i--; // Decrease i to move one character back
//                    count++;
//                }
//                i+=count1

            }
        }
        //newList.add(s.substring( s.length()-1 ));

         Collections.sort(newList);
        return newList;
    }
}
