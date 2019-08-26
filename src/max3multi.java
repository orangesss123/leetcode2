import java.util.Scanner;

/*
 * 给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，
 * 使得乘积最大，要求时间复杂度：O(n)，空间复杂度：O(1)
 */
public class max3multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		long []numbers = new long[len];
		for(int i = 0;i<len;i++)
		{
			numbers[i] = in.nextLong();
		}
		System.out.print(find3max(numbers));

	}
	public static long find3max(long []numbers){
		long max1=0;
		long max2=0;
		long max3 = 0;
		long min1=0;
		long min2 = 0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>max1)
			{
				max3=max2;
				max2=max1;
				max1=numbers[i];
			}
			else if(numbers[i]>max2)
			{
				max3=max2;
				max2=numbers[i];
			}else if(numbers[i]>max3)
			{
				max3 = numbers[i];
			}else if(numbers[i]<min1)
			{
				min2= min1;
				min1=numbers[i];
			}else if(numbers[i]<min2)
			{
				min2 = numbers[i];
			}else
				continue;
		}
		
		return Math.max(max1*max2*max3, min1*min2*max1);
	}

}
