/*Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5] */

public class remove_ll_el {
    public ListNode remove_el(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode curr_node = head;
        while (curr_node != null && curr_node.next != null) {
            if (curr_node.next.val == val) {
                curr_node.next = curr_node.next.next;
            } else {
                curr_node = curr_node.next;
            }
        }
        return head;
    }

}
