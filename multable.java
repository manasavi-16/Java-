import java.util.Scanner;

public class multable {
    public static void main(String args[])
    {
        System.out.println("enter the no you wnat multiplication tale for:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<11;i++)
        {
            System.out.println(n+"*"+i);
            System.out.print("="+(n*i));  
            System.out.println("\n");      }
    }
}
