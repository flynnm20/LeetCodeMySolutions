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
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode middle =head;
            ListNode currentNode = head;
            int index = 1;
            int i = 1;
            while(currentNode.next !=null){
                currentNode = currentNode.next;
                index++;
                if(index%2==0 && index!=1){
                    middle = middle.next;
                    System.out.println(i);
                }
            }
            return middle;
        }
    }
}
