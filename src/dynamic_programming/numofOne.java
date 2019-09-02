package dynamic_programming;

import java.util.Scanner;

/*
 * 求0-N中每个数的1的个数
 */
public class numofOne {
public static void main(String []args){
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	while(N!=-1){
		int []res = countBits(N);
		for(int i=0;i<=N;i++)
			System.out.println(res[i]);
		N = in.nextInt();
	}
}
  public static int [] countBits(int N){
	  int []f=new int[N+1];
	  f[0] = 0;
	  for(int i=1;i<=N;i++)
	  {
		  f[i] = f[i>>1]+i%2;
	  }
	  return f;
  }
  }

