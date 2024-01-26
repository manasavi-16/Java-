import java.util.*;
public class funcprod {
   public static int mul(int a, int b)
   {
    int prod=a*b;
    return prod;
   }
    
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod= mul(a,b);
        System.out.println("the product of no is:"+prod);
    }
}
