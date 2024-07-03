package subarraywithsamesum;

import java.util.ArrayList;

public class Solutiontestsum
{
    public static void main( String[] args )
    {
        int N =4;
        int S =0;
        int A[] = {1,2,3,4};

        SolutionSumSubArray testobj=new SolutionSumSubArray();
        System.out.println(testobj.subarraySum( A,N,S ));

    }

}

class SolutionSumSubArray{

    public ArrayList<Integer> subarraySum( int[] arr, int n, int s){
//    {
//        ArrayList<Integer> subArray=new ArrayList<>();
//        int sum;
//       for(int i=0;i< arr.length;i++){
//           sum=0;
//            for(int j=i;j<n;j++){
//                sum+=arr[j];
//                System.out.println( "sum = " + sum +"iteration"+i );
//                if(sum==s){
//                    subArray.add( i +1);
//                    subArray.add( j +1);
//                    return subArray;
//                }
//                if(sum>s){
//                    break;
//                }
//            }
//
//       }
//       ArrayList<Integer> nonequal=new ArrayList<>();
//       nonequal.add( -1 );
//       return nonequal;

    int sum = 0, start = 0;
    ArrayList<Integer> subArray = new ArrayList<>();

        for (int end = 0; end < n; end++) {
        sum += arr[end];

        while (sum > s&& s!=0) {
            sum -= arr[start];
            start++;
        }
        if(arr[end]==s&&s==0){
            subArray.add(end + 1);
            subArray.add(end + 1);
            return subArray;
        }

        if (sum == s) {
            subArray.add(start + 1);
            subArray.add(end + 1);
            return subArray;
        }
    }

    ArrayList<Integer> nonequal = new ArrayList<>();
        nonequal.add(-1);
        return nonequal;
    }
}
