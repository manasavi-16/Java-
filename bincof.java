import java.util.*;
public class bincof {
    public static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int bincoef(int n, int r)
    {
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int res= a/(b*c);
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n and r:");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = bincoef(n,r);
        System.out.println("the binary coefficient is"+ans);


    }
}
