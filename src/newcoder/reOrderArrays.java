package newcoder;

public class reOrderArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void reOrderArray(int [] array) {
        //有点像插入排序
        for(int i = 0;i<array.length;i++)
        {
            if(array[i]%2==1)
            {
                int j =i;
                while(j>0&&array[j-1]%2==0)
                {
                   int tem =  array[j-1];
                    array[j-1]=array[j];
                    array[j]=tem;
                    j--;
                }   
            }
        }
    
    }
    
    public void reOrderArray2(int []array)
    {
    	//空间换时间的方法
    	
    	
    }

}
