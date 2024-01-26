import java.util.*;
public class inctaxcalc {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income:");
        int income = sc.nextInt();
        int tax;
        if(income < 500000)
        {
            System.out.println("the tax applied is 0%\n therefore the income is:"+income);
        }
        else if( ( income > 500000) && ( income < 1000000))
        {
            tax= (int)(income*0.2);
            System.out.println("the tax applied is 20%\ntherefore the tax is :"+tax);
        }
        else{

            tax= (int)(income*0.3);
            System.out.println("the tax applied is 30%\n therefore the tax is:"+tax);
        }
    }
}
