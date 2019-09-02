package dynamic_programming;
/*
 * Given a m x n grid filled with non-negative numbers, 
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 */
public class Min_path_sum {

	  public int minPathSum(int[][] grid) {
	        if(grid == null||grid.length==0||grid[0].length == 0)
	            return 0;
	        int m = grid.length, n= grid[0].length;
	        int [][]paths =new int [m][n];
	        int [][]pi = new int[m][n];//记录每个位置选了什么谁
	        int i,j;
	        for(i=0;i<m;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	                if(i==0&&j==0)
	                {
	                    paths[i][j] = grid[0][0];
	                    continue;
	                }
	                
	                paths[i][j] = Integer.MAX_VALUE;
	                if(i>0)
	                {
	                   paths[i][j] = Math.min(paths[i-1][j]+grid[i][j],paths[i][j]);
	                   if(paths[i][j] ==(paths[i-1][j]+grid[i][j]))
	                	   pi[i][j]=0;//从上面来的计作0
	                }
	                if(j>0)
	                {
	                   paths[i][j] = Math.min(paths[i][j-1]+grid[i][j],paths[i][j]);
	                   if(paths[i][j] ==(paths[i][j-1]+grid[i][j]))
	                	   pi[i][j]=1;//从左边来的计作1
	                }
	            }
	        }
	        int [][]path= new int[m+n-1][2];
	        i = m-1;
	        j = n-1;
	        for(int p = m+n-2;p>=0;--p)
	        {
	        	path[p][0] = i;
	        	path[p][1] = j;
	        	if(p==0) break;
	        	if(pi[i][j]==0)
	        		--i;
	        	else
	        		--j;
	        }
	        for(int p=0;p<m+n-1;++p)
	        {
	        	System.out.print("("+path[p][0]+","+path[p][1]+")" +"-->");
	        }
	        return paths[m-1][n-1];
	    }
	  
	  public int minPathSum_youhua(int[][] grid){
		  if(grid == null||grid.length==0||grid[0].length == 0)
	            return 0;
	      int m = grid.length, n= grid[0].length;
	      int [][]paths =new int [2][n];
          int old,now = 0;
	      int i,j;
	        for(i=0;i<m;i++)
	        {
              old = now;
              now = 1-old;
	            for(j=0;j<n;j++)
	            {
	                if(i==0&&j==0)
	                {
	                    paths[now][j] = grid[0][0];
                      continue;
	                }
	                
	                paths[now][j] = Integer.MAX_VALUE;
	                if(i>0)
	                {
	                   paths[now][j] = Math.min(paths[old][j]+grid[i][j],paths[now][j]);
	                }
	                if(j>0)
	                {
	                   paths[now][j] = Math.min(paths[now][j-1]+grid[i][j],paths[now][j]);
	                }
	            }
	        }
	        return paths[now][n-1];
	  }


}
