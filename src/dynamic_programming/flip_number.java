package dynamic_programming;

public class flip_number {

	public static void main(String []args){
		
	}
	public static int digital_flip(int []a){
		if(a.length<=1)
			return 0;
		int leng = a.length;
		int [][]states = new int[leng+1][2];
		states[0][0]=0;
		states[0][1]=0;
		int i,j,k,t;
		for(i=1;i<leng+1;i++)
		{
			for(j=0;j<2;j++)
			{
				states[i][j] = Integer.MAX_VALUE;
				t=0;//indicator function
				if(j!=a[i-1])
					t=1;
				for(k=0;k<2;k++)
				{
					if(k==0&&j==1)
						continue;
					states[i][j] = Math.min(states[i-1][k]+t,states[i][j]);
				}
			}
		}
		
		return Math.min(states[leng][0],states[leng][1]);
	}
}
