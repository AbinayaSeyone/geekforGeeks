package LargestNumberFormedByArray;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormByArray
{
    public static void main( String[] args )
    {
        int n = 5;
        String arr[] =  {"54", "546", "548", "60","017"};
        LargestNumberFormByArrayTest test1=new LargestNumberFormByArrayTest();
        Comparator<String> comparator1=(s3,s4)->(s3+s4).length();
        Comparator<String> comparator = ( s1, s2) -> (s2 + s1).compareTo(s1 + s2);
        System.out.println( "comparator = " + comparator1 );
        Arrays.sort(arr,comparator);
        for(String s:arr){
            System.out.println( "s = " + s );
        }
        //System.out.println( "test1 = " + test1.printLargest( 5,arr ));
    }
}


class LargestNumberFormByArrayTest
{

//    String printLargest(int n, String[] arr) {
//        int arr2[]=new int[n];
//        int max=0;
//        for(int i=0;i<n;i++){
//            arr2[i]=Integer.parseInt( arr[i],10 );
//            max = arr[i].length() > max ? arr[i].length() : max;
//
//        }
//        int arr3[]=new int[n];
//
//
//        for(int i=0;i<n;i++){
//            arr3[i]=arr2[i];
//            while( String.valueOf(arr3[i]).length()< max){
//                arr3[i]*=10;
//            }
//        }
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                if(arr3[j]<arr3[j+1]){
//                    int temp=0;
//                    temp=arr3[j];
//                    arr3[j]=arr3[j+1];
//                    arr3[j+1]=temp;
//
//                    int temp2=0;
//                    temp2=arr2[j];
//                    arr2[j]=arr2[j+1];
//                    arr2[j+1]=temp2;
//                }
//            }
//        }
//        String test;
//        String concat="";
//
//        for(int i=0;i<n;i++){
//            test= String.valueOf( arr2[i] );
//            concat=concat +test;
//        }
//
//        return concat;
//
//    }

    String printLargest(int n, String[] arr) {
        // Custom comparator to compare strings based on concatenation order
        Comparator<String> comparator = ( s1, s2) -> (s2 + s1).compareTo(s1 + s2);

        // Sort the array of strings using the custom comparator
        Arrays.sort(arr, comparator);

        // Concatenate the sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }

}
