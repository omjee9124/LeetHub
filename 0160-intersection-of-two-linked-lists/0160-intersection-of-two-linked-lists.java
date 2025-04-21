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
        ListNode tempA = headA;
        ListNode tempB = headB;
        // if(tempA.next == null && tempB.next == null && tempA == tempB){
        //     return tempA;
        // }else if(tempA.next == null && tempB.next != null){
        //     while(tempB.next != null){
        //         if(tempA == tempB){
        //             return tempA;
        //         }
        //         tempB = tempB.next;
        //     }
        // }else if(tempB.next == null && tempA.next != null){
        //     while(tempB.next != null){
        //         if(tempA == tempB){
        //             return tempA;
        //         }
        //         tempA = tempA.next;
        //     }
        // }
        // ListNode temp = headB;
        // while(headA.next!=null){
        //     while(headB.next!=null){
        //         if(headA == headB){
        //             return headA;
        //         }
        //         headB = headB.next;
        //     }
        //     headA = headA.next;
        //     headB = temp;
        // }
        // return null;
        int m = getSize(headA);
        int n = getSize(headB);
        int diff = 0;
        if(m>n){
            diff = m-n;
            for(int i = 0 ; i <diff; i++){
                tempA = tempA.next;
            }
        }else if(n>m){
            diff = n-m;
            for(int i = 0 ; i <diff; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
        

    }
    public int getSize(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}