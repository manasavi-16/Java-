
public class buy_sell_stock {
    public static int profit(int price[])
    {
        int bp= Integer.MAX_VALUE;
        int maxP = 0;
        for(int i=0;i<price.length;i++)
       {
        if(bp<price[i])
        {
            int profit = price[i]-bp;
            maxP = Math.max(profit, maxP);
        }
        else{
            bp= price[i];
        }
       }
       return maxP;
    }
    public static void main(String args[])
    {
        int price[]={7,6,4,3,1};
        int res = profit(price);
        System.out.println("the max profit is :"+res);
    }
}
