package newcoder;

import java.util.ArrayList;

/*
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class flogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res = new ArrayList<>();
		
		res.add(1);
		res.add(2);
		res.add(3);
		int a = res.get(0);
		System.out.print(a);

	}
    public int JumpFloorII(int target) {
        if(target == 1 || target ==2)
            return target;
        int res = 1;
        while(target>1)
        {
            res+=JumpFloorII(target-1);
            target--;
        }
        return res;
    }
    //非递归方法
    public int JumpFloorII2(int target) {
        ArrayList<Integer> coll = new ArrayList<>();
        coll.add(1);
        if(target == 1 || target ==2)
            return target;
        coll.add(1);
        coll.add(2);
        int res = 1;
        for(int i =3 ;i <=target; i++)
        {
            int tem = 0;
            for(int j = 0;j<i;j++)
            {
                tem +=coll.get(j);
            }
            coll.add(tem);
        }
        return coll.get(target);
    }
}
