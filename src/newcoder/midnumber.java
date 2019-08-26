package newcoder;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
public class midnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		midnumber m = new midnumber();
		int num = in.nextInt();
		while(num!=-1)
		{
			m.Insert(num);
			System.out.print(m.GetMedian()+" ");
			num = in.nextInt();
		}
	}
	   private PriorityQueue<Integer> minheap = new PriorityQueue<>();
       private PriorityQueue<Integer> maxheap = new PriorityQueue<>(11,new Comparator<Integer>(){
           @Override
           public int compare(Integer o1, Integer o2){
               return o2.compareTo(o1);
           }
       });
       private int count = 0;
   public void Insert(Integer num) {

	   count++;
	   if((count&1)==0){
		   if(!maxheap.isEmpty()&& num < maxheap.peek()){
			   maxheap.offer(num);
			   num = maxheap.poll();
		   }
		   minheap.offer(num);
	   }else
	   {
		   if(!minheap.isEmpty()&& num >minheap.peek())
		   {
			   minheap.offer(num);
			   num = minheap.poll();
		   }
		   maxheap.offer(num);
	   }
	   
   }

   public Double GetMedian() {
       if(count==0)
		  throw new RuntimeException("no available number!");
	   double result;
		          //总数为奇数时，大顶堆堆顶就是中位数
		if((count&1)==1)
		   result=maxheap.peek();
		else
		   result=(minheap.peek()+maxheap.peek())/2.0;
		   return result;
   }



}
