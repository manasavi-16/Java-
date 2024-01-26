import java.util.*;
public class d2array {
    public static void create()
    {
        
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();
        int matrix[][]=new int [r][c];
        System.out.println("enter the elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    // public static void print()
    public static void spiral(int m[][])
    {
        int startr=0;
        int startc=0;
        int endr=m.length-1;
        int endc=m[0].length-1;
        //top
        while(startr<=endr&&startc<=endc)
        {
            for(int j=startc; j<=endc ;j++)
            {
                System.out.print(m[startr][j]+" ");
                //System.out.println("printed top");
            }
            //right
            for(int i=startr+1;i<=endr;i++)
            {
                System.out.print(m[i][endc]+" ");
                //System.out.println("printed right");
            }
            //bottom
            for(int j=endc-1;j>=startc;j--)
            {
                if(startr==endr)
                {
                    break;
                }
                System.out.print(m[endr][j]+" ");
                
            }
            for(int i=endr-1;i>=startr+1;i--)
            {
                if(startc==endc)
                {
                    break;
                }
                System.out.print(m[i][startc]+" ");
            }
            startc++;
            startr++;
            endc--;
            endr--;
        }
    }
    public static void main(String args[])
    
    {
        int m[][]= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        spiral(m);
        //create();
    }
}
