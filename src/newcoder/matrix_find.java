package newcoder;
/*
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class matrix_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public boolean find(int target, int [][] array){
		int start = 0;
		int end = array[0].length-1;
		int height = array.length;
		while(start <height && end>=0)
		{
			if(target == array[start][end])
				return true;
			else if(target < array[start][end])
			{
				end--;
			}else
				start++;
		}
		return false;
	}
}
