/*
    Given the head of a linked list, remove the nth node from the end of the list and return its head

    Input: head = [1, 2, 3, 4, 5], n = 2
    Output: [1, 2, 3, 5]

    Input: head = [1], n = 1
    Output: []

    Input: head = [1, 2], n = 1
    Output: [1]
 */


package LinkedList;

public class RemoveNodeFromEndOfList {

    public ListNodeFive removeNthFormEnd(ListNodeFive head, int n) {
        ListNodeFive dummy_head = new ListNodeFive(0);
        dummy_head.next = head;

        ListNodeFive slow = dummy_head;
        ListNodeFive fast = dummy_head;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy_head.next;

    }
}

/*
    use 2 pointers: fast and slow
    traverse the fast pointer to position n + 1
    traverse the slow pointer
    what happens is that the node that needs to be deleted is no longer linked to it's predecessor

 */
