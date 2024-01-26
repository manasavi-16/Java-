public class triplet {
    public static void trip(int num[])
    {
        int n=num.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=i+2;k<n;k++)
                {
                    // if( (i != j)&& (i != k)&& ( j != k))
                    
                        if((num[i]+num[j]+num[k])==0)
                        {

                            System.out.println("["+num[i]+" "+num[j]+" "+num[k]+"]");
                        }
                    
                   
                }
            }
        }
    }
    public static void main(String args[])
    {
        int num[]={-1, 0,  1, 2, -1, -4};
        trip(num);
    }
}
