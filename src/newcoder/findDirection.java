package newcoder;
import java.util.Scanner;

/*
 * 牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。
 * 虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
 */

/*
 * 每个输入包含一个测试用例。
每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。
 */
public class findDirection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int turntimes = in.nextInt();
		String direction = in.next();
		int L_times = 0;
		int R_times = 0;
		char []left = {'N','W','S','E'};
		char []right = {'N','E','S','W'};
		
		for(int i=0;i<turntimes;i++)
		{
			if(direction.charAt(i)=='L')
				L_times++;
			else
				R_times++;
		}
		if(L_times == R_times)
			System.out.println('N');
		else if(L_times>R_times)
		{
			L_times = (L_times-R_times)%4;
			System.out.println(left[L_times]);
		}else{
			R_times = (R_times-L_times)%4;
			System.out.println(right[R_times]);
		}
	}
	

}
