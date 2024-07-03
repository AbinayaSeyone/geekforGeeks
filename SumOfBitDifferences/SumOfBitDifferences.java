package SumOfBitDifferences;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SumOfBitDifferences
{
    public static void main( String[] args )
    {
        int n = 2;
        int arr[] = {1,2};
        String binaryString1 = Integer.toBinaryString(1);
        String binaryString2 = Integer.toBinaryString(2);
        System.out.println( "binaryString2 = " + binaryString2 );
        System.out.println( "binaryString1 = " + binaryString1 );
        int minLenBinary=binaryString1.length()<binaryString2.length()?binaryString1.length():binaryString2.length();
        int maxLenBinary=binaryString1.length()>binaryString2.length()?binaryString1.length():binaryString2.length();
        int difference=maxLenBinary-minLenBinary;
        while(difference>0){
            if(binaryString1.length()>binaryString2.length()){
                binaryString2="0"+binaryString2;
            }
            else{
                binaryString1="0"+binaryString1;
            }
            difference--;
        }
        System.out.println( "binaryString2 = " + binaryString2 );
        System.out.println( "binaryString1 = " + binaryString1 );
        SumOfBitDifferencesTest objtest=new SumOfBitDifferencesTest();
        System.out.println( "objtest = " + objtest.sumBitDifferences(arr,n));
    }

}

class SumOfBitDifferencesTest{
     public long sumBitDifferences(int[] arr, int n) {
//        long totalCount=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j< arr.length;j++){
//                String binaryString1 = Integer.toBinaryString(arr[i]);
//                String binaryString2 = Integer.toBinaryString(arr[j]);
//                int minLenBinary=binaryString1.length()<binaryString2.length()?binaryString1.length():binaryString2.length();
//                int maxLenBinary=binaryString1.length()>binaryString2.length()?binaryString1.length():binaryString2.length();
//                int difference=maxLenBinary-minLenBinary;
//                while(difference>0){
//                    if(binaryString1.length()>binaryString2.length()){
//                        binaryString2="0"+binaryString2;
//                    }
//                    else{
//                        binaryString1="0"+binaryString1;
//                    }
//                    difference--;
//                }
//                int k=0;
//
//                while(k<maxLenBinary){
//                    if(binaryString1.charAt( k )!=binaryString2.charAt( k )){
//                        totalCount++;
//                    }
//
//                    k++;
//                }
//            }
//        }
//        return totalCount;

         long totalCount = 0;

         // Count the number of set bits at each position (bit-wise count)
         for (int i = 0; i < 32; i++) { // Assuming integers are 32 bits (integers in Java are signed)
             int countOnes = 0;
             for (int num : arr) {
                 if ((num & (1 << i)) != 0) { // Check if the i-th bit is set
                     countOnes++;
                 }
             }
             int countZeros = n - countOnes; // Count of zeros is the complement of ones
             totalCount += (long) countOnes * countZeros * 2; // Multiply counts by 2 for pairs (0,1) and (1,0)
         }

         return totalCount;
    }

}
