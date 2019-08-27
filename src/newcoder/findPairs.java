package newcoder;

import java.util.Scanner;

public class findPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		long n = in.nextLong();
		long k = in.nextLong();
		long count=0;
		if(k == 0)
			System.out.println(n*n);
		//除数必须大于k，余数才可能大于k
		//本题的关键：余数的范围在0～y-1之间
		else{
			for(long y = k+1; y<=n; y++)
			{
				count +=(n/y)*(y-k);
	            if(n%y>=k)
	                count+=n%y-k+1;
			}
			System.out.print(count);
			System.out.print("this is v2");
		}
	}

}
