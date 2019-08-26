import java.util.Scanner;

public class shuangseTa {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int color1 = in.nextInt();
		int color2 = in.nextInt();
		
		int floors = getFloor(color1+color2);
		System.out.println(floors);
		System.out.print(numOfsolution(color1,color2,floors));
		
	}
	public static int getFloor(int nums){
		int sum = 2*nums;
		int floor = 0;
		while(floor*(floor+1)<=sum)
		{
			floor++;
		}
		floor=floor-1;
		return floor;
	}
	public static int numOfsolution(int a, int b,int floor){
		if(a >= 0&& b >= 0&&floor ==0)
			return 1;
		if(a<0 || b<0)
			return 0;
		return numOfsolution(a-floor,b,floor-1)
				+numOfsolution(a,b-floor,floor-1);
	}

}
