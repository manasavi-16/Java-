import java.util.*;
public class sorting {
    public static void bubblesort(int arr[])
    {
        int n=arr.length;
        int swap=0;
        for(int turn=0;turn<n;turn++)
        {
           
            for(int j=0;j<n-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            
        }
        if(swap==0)
            {
                System.out.println("the arr is already sorted");

            }
            else{
                System.out.println("the sorted array is:");
                for(int i=0;i<n;i++)
                {
                    System.out.println(arr[i]);
                }
            }
    }  
    
    public static void main(String[] args)
    {
        int arr[]={1,2,7,6,5};
        bubblesort(arr);
    } 
}
