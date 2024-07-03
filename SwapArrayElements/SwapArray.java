package SwapArrayElements;

public class SwapArray
{
    public static void main( String[] args )
    {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        SwapArrayTest obj=new SwapArrayTest();
        obj.swapElements( arr,n );
        for(int num:arr){
            System.out.println("num  :"+num);
        }
    }
}

class SwapArrayTest{
    public void swapElements(int[] arr, int n)
    {
        for(int i=0; i<n-2;i++)
        {
            int temp=0;
            temp=arr[i];
            arr[i]=arr[i+2];
            arr[i+2]=temp;
        }
    }
}
