import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 每个输入包含一个测试用例。
每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
保证不存在两项工作的报酬相同。
 */
public class findJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int jobs = in.nextInt();
		int pats = in.nextInt();
		TreeMap<Integer,Integer> di_sa = new TreeMap<>();
		int [][]diff_sala = new int[jobs][2];
		for(int i = 0; i<jobs;i++)
		{
			diff_sala[i][0]=in.nextInt();
			diff_sala[i][1]=in.nextInt();
		}
		
		//按照难度排序
		Arrays.sort(diff_sala,(e1,e2) ->(int)(e1[0]-e2[0]));
		for(int i=1;i<jobs;i++)//每份工作的报酬更新为不大于其难度的最高薪酬
		{
			diff_sala[i][1] = Math.max(diff_sala[i-1][1], diff_sala[i][1]);
		}

		for(int i=0;i<jobs;i++)//存入treemap
		{
			di_sa.put(diff_sala[i][0], diff_sala[i][1]);
		}
		for(int i=0;i<pats;i++)//存入treemap
		{
			int ability = in.nextInt();
			Integer index = di_sa.floorKey(ability);
			if(index!=null)
			{
				System.out.println(di_sa.get(index));
			}else
				System.out.println(0);
		}
		
	}

}
