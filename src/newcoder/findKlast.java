package newcoder;
/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 和寻找环一样，运用快指针和慢指针的想法，、
 * 快指针先走k-1步，慢指针再走
 * 注意特殊情况和临界值情况
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class findKlast {

    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null||k==0)
            return null;
        for(int i=0;i<k-1;i++)
        {
            fast=fast.next;
            if(fast == null)
                return null;
        }
        fast=fast.next;
        while(fast!=null)
        {
            slow =slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
