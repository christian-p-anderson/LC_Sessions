package LinkedList;

import java.util.ArrayList;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNodeThree head) {

        //convert LinkedList to an ArrayList
        ArrayList<Integer> vals = new ArrayList<>();

        ListNodeThree currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        //Use two-pointer technique to check for palindrome
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {      //we use .equals because we are comparing Integer not int
                return false;
            }
            front++;
            back--;
        }

        return true;
    }
}


/*
    convert the linkedList into an ArrayList and use 2 pointers | O(n) time and O(1) space
 */
