package newcoder;

import java.util.Scanner;

public class jump_grib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		System.out.print(methods(n));
	}
	public static int methods(int n){
		if(n==1&&n==0)
			return n;
		int []states=new int[n+1];
		states[0]=1;
		states[1]=1;
		for(int i=2;i<n+1;i++)
			states[i]=states[i-1]+states[i-2];
		
		return states[n];
	}

}
