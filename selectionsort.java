//import java.util.*;
//import java.util.Arrays;
//import java.util.Collections;
public class selectionsort {
    public static void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minpos]<arr[j])
                {
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }

    }
    public static void insertsort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int curr=arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void countsort(int arr[])
    {
        int n=arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        int m=count.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        for(int i=0;i<m;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print(int arr[])
    {
        int n=arr.length;
        System.out.println("the sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
       // Arrays.sort(arr,Collections.reverseOrder());
      // Arrays.sort(arr,1,5);
      countsort(arr);
        print(arr);
    }
}
