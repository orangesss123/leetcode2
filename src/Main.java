import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String st = in.nextLine();
		int [][]translate =new int[num+1][2];
		translate[0][0] = 0;
		translate[0][1] = 1;
		for(int i=1;i<=num;i++)
		{
			int cur = st.charAt(i-1);
			int c1=0;
			int c2=0;
			int c3=0;
			int c4=0;
			if(isDa(cur))
			{
				c1=2;
				c2=2;
				c3=1;
				c4=2;
			}else{
				c1=1;
				c2=2;
				c3=2;
				c4=2;
			}
			translate[i][0]=Math.min(translate[i-1][0]+c1, translate[i-1][1]+c2);
			translate[i][1]=Math.min(translate[i-1][1]+c3, translate[i-1][0]+c4);
		}

		System.out.println(Math.min(translate[num][0], translate[num][1]));
	
}
	public static boolean isDa(int num){
		return (num<91);
	}

}
