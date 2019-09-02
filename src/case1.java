import java.util.Arrays;
import java.util.Scanner;

public class case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s= in.nextLine();
		String []num = s.split(",");
		int []nums = new int[num.length];
		for(int i = 0;i<num.length;i++)
		{
			nums[i] = Integer.parseInt(num[i]);
		}
		case1 s1=new case1();
		System.out.print(s1.help(nums));
	}
	
	public int help(int []nums)
	{
	    Arrays.sort(nums);
		int current=-1;
		for(int i = 1;i<nums.length;i++)
		{
			if(nums[i]==nums[i-1])
			{
				nums[i]+=1;
				current=i;
				break;
			}
		}
		if(current==-1)
			return 0;
//		int times = 0;
//		int num=nums[current];
//		for(int i= current+1;i<nums.length;i++)
//		{
//			times++;
//			if(num!=nums[i])
//			{
//				break;
//			}
//			num=num+1;
//		}
//		nums[current]=num;
		return 1+help(nums);
	}

}
