import java.util.Scanner;

public class wlsumofnnos {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no you want the sum till:");
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<n+1)
        {
            sum= sum+i;
            i++;
        }
        System.out.println("the sum of natural no is:"+sum );
    }
}
