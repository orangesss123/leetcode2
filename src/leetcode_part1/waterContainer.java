package leetcode_part1;

import java.util.Scanner;

public class waterContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("请输入泳池边长数组：");
		Scanner in = new Scanner(System.in);
		String info=in.nextLine();
		while(!info.equals("exit"))
		{
			String []heights=info.split(",");
			int []height = new int[heights.length];
			for(int i=0;i<height.length;i++)
			{
				height[i]=Integer.parseInt(heights[i]);
			}
			int area = MaxArea(height);
			
			System.out.println("the max area is:"+area);
			System.out.println("请输入泳池边长数组：");
			info = in.nextLine();
		}
		
	}

	public static int MaxArea(int [] height){
		int area = 0;
		int index_left = 0;
		int index_right = height.length-1;
		
		int height_left = height[index_left];
		int height_right = height[index_right];
		
		while(index_left<index_right)
		{
			area = Math.max(area, Math.min(height_left, height_right)*(index_right-index_left));
		    //更新条件
			if(height_left<height_right)
			{
				index_left++;
				height_left = height[index_left];
			}
			else{
				index_right--;
				height_right = height[index_right];
			}
		}
		
		return area;
	}
}
