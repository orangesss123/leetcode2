package newcoder;

import java.util.Scanner;

public class eatCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int hour = in.nextInt();
		String []num = s.split(" ");
		int [] array = new int[num.length];
		for(int i=0;i<num.length;i++)
		{
			array[i]=Integer.parseInt(num[i]);
		}
		
		System.out.print(getMinSpeed(array,hour));
	}
	public static int getMinSpeed(int []array, int hour){
		int k = 0;
		int total_hour = Integer.MAX_VALUE;
		while(total_hour>hour){
			int curr=0;
			k++;
			for(int i = 0;i<array.length;i++)
			{
				curr+=Math.ceil((double)array[i]/k);
			}
			total_hour = curr;
		}
		return k;
	}

}
