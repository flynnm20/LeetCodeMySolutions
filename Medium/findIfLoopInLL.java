import java.util.HashMap;
import java.util.Hashtable;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class main {
    public static void main(String[] args) {

    }
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            HashMap<ListNode, Integer> LLMap = new HashMap();
            if(head != null){
                while(head.next != null){
                    if(LLMap.containsKey(head)){
                        return head;
                    }
                    LLMap.put(head, head.val);
                    head = head.next;
                }
            }
            return null;
        }
}
