/*
    Given the head of a singly linked list, reverse the list, and return the reversed list

    Input: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
    Output: 5 -> 4 -> 3 -> 2 -> 1 -> NULL
 */

package LinkedList;

import java.util.Stack;

public class ReverseLinkedList {

    public ListNodeOne reverseList(ListNodeOne head) {

        //traverse the list and throw it into a stack
        //the reversed list is now in the stack
        //pop things out of the stack into a new linked list

        //create a stack
        Stack<ListNodeOne> stack = new Stack<>();

        //base case
        while(head != null) {       //means we haven't gotten to the end of the list
            stack.push(head);       //when we get to the end of the list we push the last element into the stack
            head = head.next;       //so when we do the next iteration of the loop we don't process the same node
        }

        //we've gotten through the loop above | we now have a stack | we need to pick things out of the stack one by one
        // adding them to the new list
        //we need something to add (what we pick out of the stack) it to | we create a dummy node and assign it a brand
        // new value | we feel like -1 is indicative that we don't really need the node
        ListNodeOne dummy = new ListNodeOne(-1);

        //we can reuse the head variable to keep track of the node we are on in our new list
        //head points to the beginning of our new list which is our dummy node
        head = dummy;

        //while our stack is not empty we still have some nodes to add to our new list
        while(!stack.isEmpty()) {
            ListNodeOne current = stack.pop();          //current node we are on in the stack | now we have a node to process
            head.next = new ListNodeOne(current.val);   //add the node to our list
            head = head.next;                           //so the next iteration in the loop we don't want to process the same node
        }

        //once the loop above (lines 40 - 43) terminates dummy is the reference to our new list. However, dummy
        //is just the beginning of it, so all we have to return is everything following it.

        return dummy.next;

    }
}

/*
    Runtime is O(n) and complexity is O(n)
 */
