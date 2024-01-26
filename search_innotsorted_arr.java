public class search_innotsorted_arr {
    public static void res(int arr[],int key)
    {
        int n=arr.length;
        int index=minele(arr);
        if(key==arr[index])
        {
            System.out.println("the element is at :"+index);
        }
        else if(key>arr[index]&&key<arr[n-1])
        {
            int res = bin_ser(index,n-1,arr,key);
            System.out.println("the element is at:"+res);
        }
        else{
            int res=bin_ser(0,index,arr,key);
            System.out.println("the element is at:"+res);
        }
    }
    public static int minele(int arr[])
    {
        int temp= arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++)
        {
            if(temp>arr[i])
            {
                temp=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            if(temp==arr[i])
            {
                index=i;
            }
        }
        return index;
    }
    public static int bin_ser(int low,int high,int arr[],int key)
    {
        int mid=(low+high)/2;
        while(low<=high)
        {
            if(key==arr[mid])
            {
                return mid;
            }
            if(key>arr[mid])
            {
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
       
        return -1;
    }
    public  static void main(String args[])
    {
        int arr[]={4,  5, 6, 7, 0, 1, 2};
        int key = 6;
        res(arr,key);
    }
}
