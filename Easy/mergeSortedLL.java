public class Solution {
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentNode = list1;
        ListNode holdingNode = list2;
        ListNode tmp;
        ListNode head  = list1;
        if(list1 == null){
            return list2;
        }
        else if (list2 == null){
            return head;
        }
        if(list1.val > list2.val){
            head = list2;
            currentNode = head;
            holdingNode = list1;
        }
        boolean finLoop = false;
        while(currentNode.next != null){
            if(currentNode.next.val >= holdingNode.val){
                tmp = currentNode.next;
                currentNode.next = holdingNode;
                holdingNode = tmp;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = holdingNode;
        return head;
    }
}
