package dynamic_programming;

public class best_sell_buyIII {
public static int max_profit(int []P){
	int n = P.length;
	if(n==0)
		return 0;
	int [][]profit = new int[n+1][6];
	profit[0][1]=0;
	for(int k=1;k<=5;k++)
		profit[0][k]=Integer.MIN_VALUE;
	for(int i=1;i<n+1;i++)
	{
		//阶段1，3，5:profit[i][j]=Math.max(profit[i-1][j], profit[i-1][j-1]+P[i-1]-P[i-2]);
		for(int j=1;j<=5;j+=2)
		{
			profit[i][j]=profit[i-1][j];
			if(j>1&&i>1&&profit[i-1][j-1]!=Integer.MIN_VALUE)
				profit[i][j]=Math.max(profit[i][j], profit[i-1][j-1]+P[i-1]-P[i-2]);
		}
	}
	
	for(int i=1;i<n+1;i++)
	{
		//阶段2，4：profit[i][j]=Math.max(profit[i-1][j-1], profit[i-1][j]+P[i-1]-P[i-2]);
		//当日收益当天算。
		for(int j=2;j<=5;j+=2)
		{
			profit[i][j]=profit[i-1][j-1];
			if(j>1&&i>1&&profit[i-1][j-1]!=Integer.MIN_VALUE)
				profit[i][j]=Math.max(profit[i][j], profit[i-1][j]+P[i-1]-P[i-2]);
		}
	}
	return Math.max(Math.max(profit[n][1], profit[n][3]), profit[n][5]);
}
}
