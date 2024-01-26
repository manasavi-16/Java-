public class d2arrques {
    public static void count(int m[][],int key)
    {
        int r=m.length;
        int c=m[0].length;
        int count=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(m[i][j]==key)
                {
                    count+=1;
                }
               //System.out.print(matrix[i][j]+" ");
            }
            //System.out.println();
        }
        System.out.println("the key appears "+count+" times");
    }
    public static void sum2row(int m[][])
    {
        int c=m[0].length;
        int sum=0;

        for(int j=0;j<c;j++)
        {
            sum+=m[1][j];
            //System.out.println("the sum of 2nd row elements are:"+sum);
        }
        System.out.println("the sum of 2nd row elements are:"+sum);
    }
    public static void transpose(int m[][])
    {
        int r=m.length;
        int c=m[0].length;
        System.out.println("the normal matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    
        System.out.println("THE TRANSPOSE OF THE MATRIX IS:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        // int arr[][]={ {4,7,8},{8,8,7} };
        // int key=7;
        // count(arr,key); 
        int nums[][] = { {1,4,9},{11,4,3},{2,2,3} };
        //sum2row(nums); 
        transpose(nums);
    }
}

