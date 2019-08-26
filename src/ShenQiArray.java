import java.util.Scanner;
/*
 * 小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。
并且小Q对于能否被3整除这个性质很感兴趣。
小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
 */
public class ShenQiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int left =in.nextInt();
		int right = in.nextInt();
        int count = 0;
		for(int i =left;i<=right;i++)
        {
            if(i%3%2==0)
                count++;
        }
        System.out.println(count);
    }

}
/*
 *?????找规律，这么秀的吗 
 */
