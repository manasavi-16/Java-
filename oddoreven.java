import java.util.*;
public class oddoreven {
    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if((a%2)==0)
        {
            System.out.println("it is an even no:"+a);
        }
        else
        {
            System.out.println("it is an odd no:"+a);
        }
    }
}
