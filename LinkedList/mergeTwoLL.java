/*You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4] 
*/

public class mergeTwoLL {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode temp_node = new ListNode(0);
        ListNode curr_node = temp_node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr_node.next = l1;
                l1 = l1.next;
            } else {
                curr_node = l2;
                l2 = l2.next;
            }
            curr_node = curr_node.next;
        }
        if (l1 != null) {
            curr_node = l1;
            l1 = l1.next;
        }
        if (l2 != null) {
            curr_node = l2;
            l2 = l2.next;
        }
        return temp_node.next;
    }
}
