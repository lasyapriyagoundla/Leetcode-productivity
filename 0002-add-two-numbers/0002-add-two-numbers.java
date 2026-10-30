/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ListNode dummy=new ListNode(-99);
        ListNode tail=dummy;

        int a,b,c=0,s=0;
       while(l1!=null || l2!=null || c!=0)
       {
        a=(l1==null)?0:l1.val;
        b=(l2==null)?0:l2.val;
        s=a+b+c;
          tail.next=new ListNode(s%10);
          tail=tail.next;
          c=s/10;
          if(l1!=null)
          {
            l1=l1.next;
          }
          if(l2!=null)
          {
            l2=l2.next;
          }
       } 
       return dummy.next;
    }
}