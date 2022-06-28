public class main {
    public static void main(String[] args) {

    }
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
    
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null)
            return head;

        //get second node    
        ListNode second = head.next;
        //set first's next to be null
        head.next = null;

        ListNode rest = reverseList(second);
        second.next = head;

        return rest;
    }
}
