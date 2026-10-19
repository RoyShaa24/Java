package Package;

public class coin_chainge {
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
    }

    public static void main(String[] args) {
        int coins[]={1,2,5};
        int amount=5;

        System.out.println(c_ways(coins,amount));
    }
}
