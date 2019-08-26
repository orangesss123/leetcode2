package newcoder;

import java.util.Scanner;

public class robot_range {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		String s= in.nextLine();
		robot_range ex =new robot_range();
		while(!s.equals("exit")){
			String []num = s.split(",");
			int []nums= new int[num.length];
			for(int i = 0;i<nums.length;i++)
			{
				nums[i] = Integer.parseInt(num[i]);
			}
			if(ex.movingCount(nums[0], nums[1], nums[2])>nums[1]*nums[2])
				System.out.println("wrong");
			System.out.println(ex.movingCount(nums[0], nums[1], nums[2]));
		    s = in.nextLine();
		}
	}
	
	
	public int movingCount(int threshold, int rows, int cols)
    {
		boolean [][]flag = new boolean[rows][cols];
		return go_through(0,0,rows,cols,threshold,flag);
    }
	private int go_through(int i, int j,int rows, int cols,int threshold,boolean [][]flag){
		//i,j为当前机器人所在位置
		//终止条件
		if(i<0||j<0||i>=rows||j>=cols||flag[i][j] == true||numsum(i)+numsum(j)>threshold)
			return 0;
		flag[i][j] = true;
		return go_through(i+1, j, rows, cols, threshold, flag)
				+go_through(i, j+1, rows, cols, threshold, flag)
				+go_through(i-1, j, rows, cols, threshold, flag)
				+go_through(i+1, j, rows, cols, threshold, flag)
				+1;
	}
	private int numsum(int num){
		int res = 0;
		do{
			res +=num%10;
		}while((num/=10)>0);
		
		return res;
	}
}
