import java.util.*;
public class array

{

    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    public static int lin_ser(int key,int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
            //return -1;
        }
        return -1;
    }
    public static void largest(int arr[])
    {
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(large<arr[i])
            {
                large=arr[i];
            }
        }
        System.out.println("the largest no in array is:"+large);
    }
    public static int bin_ser(int arr[], int key)
    {
        int low=0;
        int high=arr.length-1;
        int mid =(low+high)/2;
        while(low<=high)
        {
            if(key == arr[mid])
            {
                return mid;
            }
            if(key>arr[mid])
            {
                low=mid+1;
            
            }
            else
            {
                high=mid-1;
            }
       
        }
        return -1;
    }
    
   public static void main(String args[] )
   {
    int marks[]= new int [50];
    int no[] = {1,2,3,4,5,6,7};
    int key =5;
    // Scanner sc = new Scanner (System.in);
    // int n = sc.nextInt();
    // for(int i=0;i<n;i++)
    // {
    //     marks[i]=sc.nextInt();
    // }
    // for(int i=0;i<n;i++)
    // {
    //     System.out.println("marks are:"+marks[i]);
    // }
    // update(marks);
    // for(int i=0;i<n;i++)
    // {
    //     System.out.println("ater updation \n marks are:"+marks[i]);
    // }
//     int index= lin_ser(key,no);
//     if(index==-1)
//     {
//         System.out.println("the key not found");

//     }
//     else
//     System.err.println("the key is at:"+index);
//    } 
    // int arr[]={11,56,89,54,76,100,67,23};
    // largest(arr);
    int arr[]={2,5,7,9,23,26,27,35,46,67};
    int k = 27;
    int res = bin_ser(arr,k);
    if(res == -1)
    {
        System.out.println("key not found");
    }
    else
    {
        System.out.println("the key is at :"+ res);
    }
   }
}
