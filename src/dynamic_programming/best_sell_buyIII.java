package dynamic_programming;

public class best_sell_buyIII {
	public static void main(String []args){
		int []arr= new int[]{3,3,5,0,0,3,1,4};
		System.out.print(maxProfit(arr));
	}
	  public static int maxProfit(int[] prices) {
	        int n = prices.length;
	        if(n==0)
	            return 0;
	        int [][]profits = new int [n+1][6];
	        
	        profits[0][1] = 0;
	        for(int i = 2;i<=5;i++)
	            profits[0][i] = Integer.MIN_VALUE;
	        
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=5;j+=2)
	            {
	                profits[i][j] = profits[i-1][j];
	                if(j>1&&i>1&&(profits[i-1][j-1]!=Integer.MIN_VALUE))
	                {
	    profits[i][j] = Math.max(profits[i][j],profits[i-1][j-1]+prices[i-1]-prices[i-2]);
	                }
	            }
	            
	            for(int j=2;j<=5;j+=2)
	            {
	                profits[i][j] = profits[i-1][j-1];
	                if(i>1&&(profits[i-1][j]!=Integer.MIN_VALUE))
	                {
	         profits[i][j] = Math.max(profits[i][j],profits[i-1][j]+prices[i-1]-prices[i-2]);
	                }
	            }
	        }
	        for(int i=0;i<=n;i++)
	        {
	        	for(int j=1;j<=5;j++)
	        		System.out.print(profits[i][j]+" ");
	        	System.out.println();
	        }
	        int res=0;
	        for(int j=1;j<=5;j++)
	            res=Math.max(res,profits[n][j]);
	        
	        return res;
	    }
}
