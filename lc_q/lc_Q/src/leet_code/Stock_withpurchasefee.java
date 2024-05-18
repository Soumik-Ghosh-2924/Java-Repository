
class Stock_withpurchasefee 
{
	public static int max_profit(int[]prices, int fee)
	{
		int profit=0;
		int hold=Integer.MIN_VALUE;
		
		for(int i=0;i<prices.length;i++)
		{
			profit=Math.max(profit, hold+prices[i]);
			hold=Math.max(hold, profit-prices[i]-fee);
		}
		
		return profit;
	}

}
