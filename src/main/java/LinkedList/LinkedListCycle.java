/*
    Given head, the head of a linked list, determine if the linked list has a cycle in it.
    There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
    following the next pointer. Internally, pos is used to denote the index of the noe that tail's next pointer is
    connected to. Note that pos is not passed as a parameter

    Return true, if there is a cycle in the linked list. Otherwise, return false.

    Input: head = [3, 2, 0, -4], pos = 1
    Output: true
    Explanation: there is a cycle in the linked list, where the tail connects to the 1st node (0-indexed)

    Input: head = [1, 2], pos = 0
    Output: true
    Explanation: there is a cycle in the linked list, where the tail connects to the 0th node
 */


package LinkedList;

public class LinkedListCycle {

    public boolean hasCycle(ListNodeFour head) {

        //base cases
        if (head == null || head.next == null) {
            return false;
        }

        //create the pointers
        ListNodeFour slow = head;
        ListNodeFour fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}

/*
    Use two pointers. One is fast and another is slow. If the fast pointer hits null then there is no cycle. If they
    run into each other then there is a cycle.
 */
