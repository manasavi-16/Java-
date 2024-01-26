import java.util.*;
public class strings {
    public static boolean pal(String str)
    {
        int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)==str.charAt(n-i-1))
                continue;
            else{
                return false;
            } 
        }
        return true;
    }
    public static float shortestpath(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
           char dir=path.charAt(i);
           if(dir=='S')
            y--;
           else if(dir=='N')
            y++;
           else if(dir=='W')
            x--;
           else
            x++;  
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static boolean compare(String str,String s)
    {
        if(str.equals(s))
            return true;
        return false;    
    }
    public static String substring(String str,int si,int ei)
    {
        String substr="";
        for(int i=si;i<ei;i++)
        { 
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static String largest(String str[])
    {
        String largest=str[0];
        for(int i=0;i<str.length;i++)
        {
            if(largest.compareTo(str[i])<0)
            largest=str[i];
        }
        return largest;
    }
    public static void main(String args[])
    {
        String s="dooms";
        boolean res =pal(s);
        System.out.println(res);
        String path = "SN";
        float r=shortestpath(path);
        System.out.println(r);
        String str="tony";
        String s2= new String ("tony");
        boolean r1=compare(str, s2);
        String s1="hello world";
        String r2=substring(s1, 0, 5);
        System.out.println(r1);
        System.out.println(r2);
        String fruits[]={"mango","apple","banana"};
        String r3 = largest(fruits);
        System.out.println(r3);


    }
}
