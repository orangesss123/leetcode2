package dynamic_programming;

public class unique_pathII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if( m ==0||n==0||obstacleGrid[m-1][n-1]==1)
            return 0;
        
        int [][]path = new int[m][n];
        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(obstacleGrid[i][j]==1)
                {
                    path[i][j] =0;
                }else
                {
                if(i==0&&j==0)
                    path[i][j]=1;
                if(i>0)
                    path[i][j]+=path[i-1][j];
                if(j>0)
                    path[i][j]+=path[i][j-1];
                }
            }
        }
        
        return path[m-1][n-1];
    }
}
