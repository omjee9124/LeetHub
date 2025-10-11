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
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode temp1 = head;
        // ListNode temp2 = head.next;
        // // if(temp1.next!=null){
        // //     temp2 = head.next;
        // // }

        // while(temp2.next!= null && temp1.next.next != null){
        //     if(temp1.val == temp2.val){
        //         temp2 = temp2.next;
        //     }else{
        //         temp1 = temp1.next;
        //         temp2 = temp2.next;
        //     }
        //     temp1.next = temp2;
        // }
        // return head;

        ListNode temp = head;
        if(temp == null) return temp;
        while(temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}