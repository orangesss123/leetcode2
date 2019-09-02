package dynamic_programming;

import java.util.Scanner;

/*
 * 给定一个数组，求其最长递增子序列的长度，不要求子序列连续
 * eg.[10,9,2,5,3,7,101,18] -->输出：4，最长子序列为[2,3,7,101]
 * 思想：记录每个每个位置的数下，以该数为结尾的最长长度，即前面小于该数的长度+1，
 * 然后在这些当中选最长的
 * 时间复杂度为o(n^2)
 */
public class longest_increse_sqen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int []nums =new int[n];
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=in.nextInt();
		}
		System.out.println(lengthOfLIS(nums));
	}
	
    public static int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int m = nums.length;
        int []states = new int[m];
        states[0] = 1;
        for(int i=1;i<m;i++)
        {
            states[i]=1;
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]<nums[i])
                {
                    states[i] =Math.max(states[j]+1,states[i]);
                }
            }
        }
        int res=0;
        for(int i=0;i<m;i++)
        {
            res = Math.max(res,states[i]);
        }
        return res;
    }

}
