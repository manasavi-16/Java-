import java.util.*;
public class primeno {
    public static void main(String args[])
    {
        System.out.println("enter the no you want to check");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=2;
        int flag=0;
        if((n==2) || (n==3) )
        {
            System.out.println("the no is prime");
           
        }
        else
        {
            for(i=2;i<=Math.sqrt(n);i++)
            {  
                if(n%i==0)
                {
                    System.out.println("the no is not prime");
                    break;
                }
            flag=1;
            }
            if(flag==1)
            {
                System.out.println("the no is prime");
            }
        }
    }
}
