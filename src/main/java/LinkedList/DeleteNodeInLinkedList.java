/*
    Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list,
    instead you will be given access to the node to be deleted directly.
    It is guaranteed that the node to be deleted is not a tail node in the list.

    Input: head - [4,5,1,9], node = 5
    Output: [4,1,9]
    Explanation: You are given the second node with value 5.

 */


package LinkedList;

public class DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

/*
    Copy the node to the right to the node you want to delete and then delete the node to the right. Then have the
    node that was to be removed point to the tail of the linked list.
 */
