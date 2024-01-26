import java.util.*;
public class max_sub_array_brute {
    
    public static void subarray(int arr[])
    {
        int ts=0;
        int sum=0;
        int maxsum=0;
        //int sumres[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                     sum=sum+arr[k];
                }
                System.out.println();
                System.out.println("sum of the sub array are:"+sum);
                //sum[]
                if(maxsum<sum)
                {
                    maxsum=sum;
                }
                sum=0;
                ts++;
            }
            System.out.println();
        }
        System.out.println("total sub arrays are:"+ts);
        System.out.println("max sum of sub array is :"+maxsum);
    }
    public static void main(String args[] )
   {
    int arr[]={2,5,7,9,11,15};
    //reverse(arr);
    //pairs(arr);
    subarray(arr);

   }
}
