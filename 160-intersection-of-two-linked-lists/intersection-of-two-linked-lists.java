/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0;
        int l2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1!=null){
            l1++;
            temp1 = temp1.next;
        }
         while (temp2!=null){
            l2++;
            temp2 = temp2.next;
        }
        ListNode temp3 = headA;
        ListNode temp4 = headB;
        if (l1>l2){
            int diff = l1-l2;
            for (int i=1;i<=diff;i++){
                temp3 = temp3.next;
            }
        }
        else{
            int diff2 = l2-l1;
             for (int i=1;i<=diff2;i++){
                temp4 = temp4.next;
            }
        }
        while(temp3!=temp4){
            temp3 = temp3.next;
            temp4 = temp4.next;
        }
        return temp3;
    }
}