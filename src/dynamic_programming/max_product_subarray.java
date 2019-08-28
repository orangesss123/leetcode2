package dynamic_programming;
/*
 * Given an integer array nums,
 * find the contiguous subarray within an array (containing at least one number)
 * which has the largest product.
 */
public class max_product_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int maxProduct(int[] nums) {
        //记录到目前位子为止出现的最大值或最小值
        int []maxstates = new int[nums.length];
        int []minstates = new int[nums.length];
        maxstates[0] = nums[0];
        minstates[0] = nums[0];
        //
        int max=Integer.MIN_VALUE;
        for(int i = 1; i<nums.length;i++)
        {
        	//当前位置能取得的最大值只于前一位子和本身的有关，因为存在负值，所以当前位子的
        	//最大值和最小值都要记录
        	
            maxstates[i] = Math.max(Math.max(nums[i]*maxstates[i-1],
                                   nums[i]*minstates[i-1]),nums[i]);
            minstates[i] = Math.min(Math.min(nums[i]*maxstates[i-1],
                                   nums[i]*minstates[i-1]),nums[i]);
            if(maxstates[i]>max)
                max = maxstates[i];
        }
        return max;
    }
}
