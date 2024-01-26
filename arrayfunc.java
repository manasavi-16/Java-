import java.util.*;
public class arrayfunc {
    public static void reverse(int arr[])
    {
        int f=0,l=arr.length-1;
        while(f<l)
        {
            int temp = arr[l];
            arr[l] = arr[f];
            arr[f] = temp;
            f++;
            l--;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void pairs(int arr[])
    {
        int tp=0;
        for(int i=0;i<arr.length;i++)
        {
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.println("("+curr+","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are:"+tp);
    }
    public static void subarray(int arr[])
    {
        int ts=0;
        int sum=0;
        //int sumres[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                     
                }
                System.out.println();
                System.out.println("sum of the sub array are:"+sum);
                
                ts++;
            }
            System.out.println();
        }
        System.out.println("total sub arrays are:"+ts);
    }
    public static void main(String args[] )
   {
    int arr[]={2,5,7,9,11,15};
    //reverse(arr);
    //pairs(arr);
    subarray(arr);

   }
}
