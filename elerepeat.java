//import java.util.*;
public class elerepeat {
    public static boolean array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(temp==arr[j])
                {
                  
                     return true;
                    
                }
            }
        }
        return false;
    }
    public static void trw(int height[])
    {
        int n=height.length;
        int res =0, l=0, r=n-1;
        int lmax=height[l],rmax=height[r];
        while(l<r)
        {
            if(lmax<rmax)
            {
                l++;
                lmax= Math.max(lmax,height[l]);
                res+=lmax-height[l];
            }
            else{
                r--;
                rmax=Math.max(rmax,height[r]);
                res+=rmax-height[r];
            }
        }
        System.out.println("the amount of trapped rainwater is :"+res);

    }

    public static void main(String args[])
    {
       // int arr[]={1, 2, 3, 1};
        int arr1[]={5, 2, 3, 4};
        boolean res = array(arr1);
        System.out.println(res);
        int height[]={4,2,0,6,3,2,5};
        trw(height);
    }
}
