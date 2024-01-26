import java.util.*;
public class patterns {
    public static void hollowrect(int r,  int c)
    {
        for (int i=1; i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if( i== 1 || i == r || j==1 || j==c)
                {
                    //boundary cells
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void inv_rot_halfpyr(int r)
    {
        for (int i=1; i<=r;i++)
        {
            for(int j=1;j<=r-i;j++)
            {
               
                    System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++)
            {   
                    System.out.print("*");
              
            }
            System.out.println();
        }
    }
    public static void inv_hp_no(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void invfloydstri(int n)
    {
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i+1;j++)
            {
                System.out.print("  "+a );
                a++;
            }
            System.out.println();
        }
    }
    public static void floydstri(int n)
    {
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("  "+a );
                a++;
            }
            System.out.println();
        }
    }
    public static void bintri(int n)
    {
      for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1" );
                }
                else
                {
                    System.out.print("0");
                }
               
              
            }
            System.out.println();
        }
    }
    public static void butterfly(int n)
    {

        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            } 
            System.out.println();
        }
    }
    public static void sol_rhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if( i== 1 || i == n || j==1 || j==n)
                {
                    //boundary cells
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n)
    {

        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            // for(int j=1;j<=i;j++)
            // {
            //     System.out.print("*");

            // }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            // for(int j=1;j<=i;j++)
            // {
            //     System.out.print("*");

            // } 
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        //hollowrect(10,7);
       // inv_rot_halfpyr(5);
       //inv_hp_no(5);
       //invfloydstri(5);
       //floydstri(5);
       //bintri(7);
       //butterfly(4);
       //sol_rhombus(7);
       //hollow_rhombus(5);
       diamond(4);
    }
}
