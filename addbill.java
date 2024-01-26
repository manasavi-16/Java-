import java.util.*;

	public class addbill{
		public static void main( String args[])
		{
			Scanner sc= new Scanner(System.in);
            System.out.println("enetr cost of pen:");
            Float a = sc.nextFloat();
            System.out.println("enter the cost of pencil:");
            Float b = sc.nextFloat();
            System.out.println("enetr the price of eraser:");
            Float c= sc.nextFloat();
            Float bill= a+b+c;
            System.out.println("the total cost is: ");
            System.out.println(bill);
            int ch='$';
            System.out.println(ch);

		}
	}