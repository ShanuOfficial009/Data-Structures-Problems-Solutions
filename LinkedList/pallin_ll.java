/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false 
*/

public class pallin_ll {
    public boolean isPalindrome(ListNode head) {

        // finding the mid

        ListNode sp = head, fp = head, mid = null;
        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
        }

        /// add --> if fp is not null

        if (fp != null) {
            mid = sp.next;
        } else {
            mid = sp;
        }
        ListNode prev = null, next = null;
        while (mid != null) {
            next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        while (prev != null) {
            if (prev.val != head.val)
                return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
