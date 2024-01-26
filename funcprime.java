import java.util.*;
public class funcprime {
    public static boolean isPrime(int n)
    {
        boolean isPrime=true;

        if(n==2)
        return true;
        if(n==3)
        return true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void primeinrange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            System.out.println(i+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        boolean res = isPrime(n);
        System.out.println(res);
        int x = sc.nextInt();
        primeinrange(x);
    }
}
