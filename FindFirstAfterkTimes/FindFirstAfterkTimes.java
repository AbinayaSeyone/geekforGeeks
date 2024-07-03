package FindFirstAfterkTimes;

import java.util.HashMap;

public class FindFirstAfterkTimes
{
    public static void main( String[] args )
    {
        int n = 7, k = 2;
        int a[] = {1, 7, 4, 3, 4, 8, 7};
        FindFirstAfterkTimesTest obj=new FindFirstAfterkTimesTest();
        System.out.println( " Output = " +  obj.firstElementKTime( n,k,a ));
    }
}

class FindFirstAfterkTimesTest
{
    public int firstElementKTime(int n, int k, int[] a) {
        HashMap<Integer,Integer> elementTimes=new HashMap<>();
        for(int i=0;i<n;i++){
            elementTimes.put( a[i], elementTimes.getOrDefault(a[i],0)+1 );
            if(elementTimes.get( a[i] )==k){
                return a[i];
            }
        }

        return -1;

    }
}
