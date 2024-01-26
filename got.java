import java.util.Scanner;

public class got {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("the greatest no is:"+a);

            }
            else
            {
                System.out.println("the geratest no is:"+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("the greatest no is:"+b);
            }
            else{
                System.out.println("the greatest no is"+c);
            }
        }
    }
}
