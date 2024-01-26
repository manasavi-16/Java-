import java.net.Inet4Address;

public class max_sum_prefix {
    public static void subarray(int arr[])
    {
       int prefix[]= new int [arr.length];
        int sum=0;
        int maxSum=0;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=arr[i-1]+arr[i];
        }
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               sum= i==0?prefix[j]: prefix[j]-prefix[i-1];
                if(maxSum<sum)
                {
                    maxSum = sum;
                }
               
            }
           
        }
        System.out.println("max sum is :"+maxSum);
       
    }
    public static void kadanes(int arr[])
    {
        int ms = Integer.MIN_VALUE;
        int cs=0;
        int flag=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                flag=0;
            }
            else{
                flag =1;
                break;
            }
        }
        if(flag==0)
        { 
            int temp = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                if(temp<arr[i])
                {
                    temp=arr[i];
                }
            }  
            System.out.println("the max sum is :"+temp);
        }
        else{
            for (int i=0;i<arr.length;i++)
            {
                cs= cs+arr[i];
                if(cs<0)
                {
                    cs=0;
                }
                if (ms<cs)
                {
                    ms=cs;
                }
            }
            System.out.println("max sum is :"+ms);
        }
       

    }   
    public static void main(String args[] )
   {
    //int arr[]={2,5,-7,9,-11,15};
    //reverse(arr);
    //pairs(arr);
    int arr[]={-1,2,3};
    kadanes(arr);
   }
    
}
