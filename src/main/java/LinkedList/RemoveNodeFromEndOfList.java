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
        ListNodeFive dummy_head = new ListNodeFive(-1);
        dummy_head.next = head;

        ListNodeFive slow = dummy_head;
        ListNodeFive fast = dummy_head;

        //this moves the fast pointer n spaces in front of the slow pointer
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        //now move both pointers at the same time
        //stop when the fast pointer equals null
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        //point the slow pointer to the deleted node's successor (aka the node following the node that needs to be
        //deleted)
        slow.next = slow.next.next;

        //cuts off the dummy node
        return dummy_head.next;

    }
}

/*
    use the 2 pointer technique with a fast and slow pointer
    start with a dummy head

    keep distance between the fast and slow pointer equal to n | move the fast node ahead of the slow node by n
    then move both pointers at the same time

    when the fast node reaches the end, have the slow node skip over the node that needs to be deleted

    what happens is that the node that needs to be deleted is no longer linked to it's predecessor

 */
