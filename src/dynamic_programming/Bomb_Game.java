package dynamic_programming;

public class Bomb_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int max_killer(int [][]map){
		int [][]up =new int[map.length][map[0].length];
		int [][]down =new int[map.length][map[0].length];
		int [][]left =new int[map.length][map[0].length];
		int [][]right =new int[map.length][map[0].length];
		int m=map.length;
		int n= map[0].length;
		int i,j,k;
		//compute up
		for(i = 0;i<map.length;i++)
		{
			for(j=0;j<map[0].length;j++)
			{
				up[i][j]=0;
				if(map[i][j] != 'W')
				{
					if(map[i][j] == 'E')
						up[i][j] = 1;
					if(i>0)
						up[i][j]+=up[i-1][j];
				}
					
			}
		}
		
		//compute down
		for(i = m-1;i>=0;i--){
			for(j=0;j<n;j++)
			{
				down[i][j] =0;
				if(map[i][j]!='W')
				{
					if(map[i][j]=='E')
						down[i][j] =1;
					if(i<m-1)
						down[i][j] +=down[i+1][j];
				}
			}
		}
		//compute left
		for(i = 0;i<map.length;i++)
		{
			for(j=0;j<map[0].length;j++)
			{
				left[i][j]=0;
				if(map[i][j] != 'W')
				{
					if(map[i][j] == 'E')
						left[i][j] = 1;
					if(j>0)
						left[i][j]+=left[i][j-1];
				}
					
			}
		}
		//compute right
		for(i = m-1;i>=0;i--){
			for(j=0;j<n;j++)
			{
				right[i][j] =0;
				if(map[i][j]!='W')
				{
					if(map[i][j]=='E')
						right[i][j] =1;
					if(j<n-1)
						right[i][j] +=right[i][j+1];
				}
			}
		}
		//最后枚举所有格子
		int res = 0;
		for(i = 0;i<map.length;i++)
		{
			for(j=0;j<map[0].length;j++)
			{
			res = Math.max(res,right[i][j]+left[i][j]+ down[i][j]+up[i][j]);	
			}
		}
		return res;
	}

}
