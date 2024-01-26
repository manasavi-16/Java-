import java.util.*;
public class bintodec {
    public static void  bintodec(int bno)//binary no
    {
        int pow=0;
        int dno=0;//decimal no
        while(bno>0)
        {
            int rem = bno%10;
            dno = dno + (rem * (int)Math.pow(2,pow));
            pow++;
            bno = bno/10;
        }
        System.out.println("decimal of is:"+ dno);
    }
    public static void dectobin(int dno)
    {
        int pow = 0;
        int bno = 0;
        while(dno>0)
        {
            int rem = dno%2;
            bno = bno +(rem * (int)Math.pow(10 , pow));
            pow++;
            dno = dno/2;
        }
        System.out.println("the binary no is:"+bno);
    }
    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int bno = sc.nextInt();
        bintodec(bno);
        int dno= sc.nextInt();
        dectobin(dno);

    }
}
