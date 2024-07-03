package playWithOR;

import java.util.ArrayList;

public class Solutiontest
{
    public static void main( String[] args )
    {
        SolutionOR testOR= new SolutionOR();
        int n = 5;
        int arr[] = {10, 11, 1, 2, 3};
        for(int number:testOR.game_with_number(arr,n  )){
            System.out.println( "number = " + number);
        }

    }
}

class SolutionOR{

    // Function for finding maximum and value pair
    public int[] game_with_number (int arr[], int n) {

        for(int i=0;i< arr.length;i++){
            if(i== arr.length-1){
                arr[i]=arr[i];
            }
            else{
                arr[i]=arr[i]|arr[i+1];
            }

        }

        return arr;

    }


}
