package newcoder;
/*
 * 用两个栈实现一个队列
 */
import java.util.Stack;

public class twostack_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    public int pop(){
        if(stack1.isEmpty()&&stack2.isEmpty())
            throw new RuntimeException("empty stack");
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());//并不需要再次压入栈中
        }
        return stack2.pop();
    }

}
