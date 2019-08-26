package newcoder;
/*
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}
public class reconstructTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0|| in.length == 0)
            return null;
        TreeNode root = new TreeNode(pre[0]);
        int index = getindex(pre[0],in);
        int []leftpre = getnewarray(pre,1,index);
        int []leftin = getnewarray(in,0,index-1);
        
        int []rightpre = getnewarray(pre,index+1,pre.length-1);
        int []rightin = getnewarray(in,index+1,in.length-1);
        
        root.left = reConstructBinaryTree(leftpre,leftin);
        root.right = reConstructBinaryTree(rightpre,rightin);
        
        return root;
    }
    public int getindex(int target,int []array){
        int ind = 0;
        for(int i = 0;i<array.length;i++)
        {
            if(target == array[i])
            {
                ind =i;
                break;
            }
        }
        return ind;
    }
    public int []getnewarray(int []orig, int start, int end)
    {
        int []newarr = new int[end-start+1];
        for(int i=start;i<=end;i++)
        {
            newarr[i-start] = orig[i];
        }
        return newarr;
    }

}
