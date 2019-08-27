package newcoder;
/*
 * 农场有n只鸡鸭排为一个队伍，
 * 鸡用“C”表示，鸭用“D”表示。
 * 当鸡鸭挨着时会产生矛盾。需要对所排的队伍进行调整，
 * 使鸡鸭各在一边。每次调整只能让相邻的鸡和鸭交换位置，
 * 现在需要尽快完成队伍调整，你需要计算出最少需要调整多少次可以让上述情况最少。
 * 例如：CCDCC->CCCDC->CCCCD这样就能使之前的两处鸡鸭相邻变为一处鸡鸭相邻，需要调整队形两次。
 */
import java.util.Scanner;

public class Duck_Chicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String que = in.nextLine();
		int leng = que.length();
		int []sumD = new int[]{0,0};
		int find = 0;//目前已经移动的鸭的数量
		for(int i = 0; i< leng; i++)
		{
			if(que.charAt(i)=='D')
			{
				sumD[0]+=(i-find);//离左边的距离-已经移动的鸭的数量
				sumD[1]+=(leng-i-1-find);//离右边的距离
				find++;
			}
		}
		
		System.out.print(Math.min(sumD[0],sumD[1]));
	}

}
