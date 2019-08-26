import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int leng = in.nextInt();
		int []a = new int[leng];
		for(int i=0;i<leng;i++)
			a[i]=in.nextInt();
		int []c=new int[leng];
		c[0]=0;
		for(int i=1; i<leng;i++)
		{
			if(a[i]>a[c[i-1]])
				c[i]=i;
			else
				c[i]=c[i-1];
		}
		int ans=0;
		int n=leng-1;
		while(n>0)
		{
			ans++;
			n=c[n]-1;
		}
		System.out.print(ans);
			
	}

}
