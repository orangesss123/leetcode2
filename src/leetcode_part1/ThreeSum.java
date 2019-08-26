package leetcode_part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		while(!s.equals("exit")){
			String []ss=s.split(",");
			int []nums=new int[ss.length];
			for(int i=0;i<nums.length;i++)
			{
				nums[i]=Integer.parseInt(ss[i]);
			}
			System.out.println(threeSum(nums));
			s=in.nextLine();
		}
    
	}
    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new ArrayList<>();
    	if(nums==null || nums.length==0) return res;
    	HashSet <Integer>keys=new HashSet<>(); 
    	Arrays.sort(nums);
    	
    	HashMap <Integer,Integer> v_i=new HashMap<>();
    	//将所有nums都放入
    	for(int i=0;i<nums.length;i++)
    	{
    		keys.add(nums[i]);
    		v_i.put(nums[i],i);
    	}
    	
        for(int i=0;i<nums.length-2;i++)
        {
        	if(!keys.contains(nums[i]))
        		continue;
        	for(int j=i+1;j<nums.length-1;j++)
        	{
        		ArrayList<Integer> tem= new ArrayList<>();
        		int sum2=nums[i]+nums[j];
        		if(v_i.containsKey(-sum2)&&v_i.get(-sum2)>j)
        		{
        			tem.add(nums[i]);
        			tem.add(nums[j]);
        			tem.add(-sum2);
        		}
        		if(!tem.isEmpty())
        		   res.add(tem);
        	}
        	keys.remove(nums[i]);
        }
        return res;
}

}
