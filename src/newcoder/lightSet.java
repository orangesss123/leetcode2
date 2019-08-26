package newcoder;

import java.util.Scanner;

/*
 * 小Q正在给一条长度为n的道路设计路灯安置方案。
为了让问题更简单,小Q把道路视为n个方格,需要照亮的地方用'.'表示,
 不需要照亮的障碍物格子用'X'表示。
小Q现在要在道路上设置一些路灯, 对于安置在pos位置的路灯, 
这盏路灯可以照亮pos - 1, pos, pos + 1这三个位置。
小Q希望能安置尽量少的路灯照亮所有'.'区域, 希望你能帮他计算一下最少需要多少盏路灯。
 *
 *输入的第一行包含一个正整数t(1 <= t <= 1000), 表示测试用例数
  接下来每两行一个测试数据, 第一行一个正整数n(1 <= n <= 1000),表示道路的长度。
  第二行一个字符串s表示道路的构造,只包含'.'和'X'。
 */
public class lightSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for(int i = 0;i<cases;i++)
		{
			int leng = in.nextInt();
			String construction = in.next();
			System.out.println(leastLights(construction, 0, leng-1));
		}
	}
	public static int leastLights(String s,int pos, int end){
		//第一步:从pos开始找到第一个为'.'的位置
		int res = 0;
		if(pos>end)
			return 0;
		while(s.charAt(pos)!='.')
			{
			pos++;
			if(pos>end)
				return 0;
			}
		return (1+(leastLights(s,pos+3,end)));
	}

}
/*
 *解法：这种题要设置一个策略
 */
