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
    public ListNode mergeKLists(ListNode[] lists) {
         int n=lists.length;
         if(n==0)
         {
            return null;
         }
         ListNode dummy=new ListNode(-99);
         ListNode tail=dummy;
         PriorityQueue<ListNode> pq=new PriorityQueue<>(
            (a,b)->Integer.compare(a.val,b.val)
         );
         for(ListNode x: lists)
         {
            if(x!=null)
            pq.add(x);
         }
         while(!pq.isEmpty())
         {
          ListNode d=pq.remove();
          tail.next=(d);
          tail=tail.next;
          if(d.next!=null)
          {
            pq.add(d.next);
          }
         }
         return dummy.next;
    }
}