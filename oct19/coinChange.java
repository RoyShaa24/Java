package oct19;

public class coinChange {
    static int c_ways(int []coins,int amount)
    {
        int d[]=new int [amount+1];
        d[0]=1;

        for(int coin:coins)
        {
            for(int i=coin;i<amount;i++)
            {
                d[i]=d[i]+d[i-coin];
            }
        }
        return d[amount];
    
