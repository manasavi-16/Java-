public class diagnolsum {
    public static void sum(int m[][])
    {
        int sum=0;
        for(int i=0;i<m.length;i++)
        {
            sum+=m[i][i];
            if(i!=m.length-1-i)
            {
                sum+=m[i][m.length-i-1];
            }
        }
        System.out.println("the sum is:"+sum);
    }
    public static boolean staircase_ser(int m[][],int key)
    {
        int r=0,c=m[0].length-1;
        while(r<m.length && c>=0)
        {
            if(m[r][c]==key)
            {
                System.out.println("found key at ("+r+","+c+")");
                return true;
            }
            else if(key<m[r][c])
                c--;
            else
                r++;
        }
        System.out.println("the key not found");
        return false;
    }
    public static boolean strcase(int m[][],int key)
    {
        int r=m.length-1,c=0;
        while(r>=0 && c<m[0].length)
        {
            if(m[r][c]==key)
            {
                System.out.println("found key at ("+r+","+c+")");
                return true;
            }
            else if(key>m[r][c])
                c++;
            else
                r--;
        }
        System.out.println("the key not found");
        return false;
    }
    public static void main(String args[])
    {
        int m[][]= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        //sum(m);
        int key=14;
        boolean res = staircase_ser(m, key);
        boolean r1=strcase(m, key);

    }
    
}
