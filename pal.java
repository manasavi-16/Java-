import java.util.*;
public class pal {
    public static void palin(int n)
    {
        int rev=0;
        int rem;
        int temp =n;
        while(n>0)
        {
            rem= n%10;
            rev = rev*10 + rem;
            n= n/10;
        }
        if(temp==rev)
        {
            System.out.println("the no is a palindrome");

        }
        else
        System.out.println("the no is not a palindrome");
    }
    public static void sumofdig(int n)
    {
        int sum=0;
        int rem;
        while(n>0)
        {
            rem = n%10;
            sum= sum+rem;
            n = n/10;
        }
        System.out.println("the sum of the digits is :"+sum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        palin(n);
        sumofdig(n);
    }
}
