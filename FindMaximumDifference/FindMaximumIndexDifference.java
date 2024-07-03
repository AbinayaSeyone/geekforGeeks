package FindMaximumDifference;

import java.util.HashMap;

public class FindMaximumIndexDifference
{
    public static void main( String[] args )
    {
        int n=10;
        int a[]={29, 29 ,8 ,1, 26 ,10, 1 ,22 ,14 ,26};
        FindMaximumIndexDifferenceTest obj= new FindMaximumIndexDifferenceTest();
        System.out.println( "obj = " + obj.maxIndexDiff( a,n ) );

    }
}

class FindMaximumIndexDifferenceTest{
    int maxIndexDiff(int a[], int n) {
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0+i;j--){
                if(a[j]>a[i]){
                    int temp=j-i;
                    if(temp>max){
                        max=temp;
                    }
                }
            }
        }

        return max;
//      ------------------------next--------------



    }
}
