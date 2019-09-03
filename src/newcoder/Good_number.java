package newcoder;

import java.util.HashMap;
import java.util.Scanner;

public class Good_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print(number_good(n));
	}
	public static int number_good(int n){
		HashMap<Integer,Integer> rotation = new HashMap<>();
		rotation.put(0, 0);
		rotation.put(1, 1);
		rotation.put(2, 5);
		rotation.put(5, 2);
		rotation.put(6, 9);
		rotation.put(9, 6);
		rotation.put(8, 8);
		
		int res = 0;
		
		for(int i=0;i<=n;i++)
		{
			int num = rotation_number(i,rotation);
			if(num!=-1&&num!=i)
				res+=1;
		}
		
		return res;
	}
	public static int rotation_number(int num,HashMap<Integer,Integer> map){
		int res=0;
		int expon = 1;
		while(num>=1)
		{
			int cur = num%10;
			if(!map.containsKey(cur))
				return -1;
			int rota = map.get(cur);
			res=res+rota*expon;
			expon*=10;
			num/=10;	
		}
		System.out.println(res);
		return res;
	}

}
