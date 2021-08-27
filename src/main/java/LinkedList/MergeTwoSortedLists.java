/*
    Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes
    of the first two lists

    Input: l1 = [1, 2, 4] l2 = [1, 3, 4]
    Output: [1, 1, 2, 3, 4, 4]
 */

package LinkedList;

public class MergeTwoSortedLists {

    public ListNodeTwo mergeTwoLists(ListNodeTwo l1, ListNodeTwo l2) {

        //create a dummy node to build onto
        ListNodeTwo dummy = new ListNodeTwo(-1);
        //
        ListNodeTwo head = dummy;

        //look at both lists | take the first element of each list and determine which one is smaller | take the smaller
        //element and put it into the list | move forward in that list by 1 element
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }

        //you may have a situation where one list still has remaining elements | determine which list has remaining
        //elements and add those elements to the list
        if (l1 != null) {
            dummy.next = l1;
        } else {
            dummy.next = l2;
        }

        //since the dummy node has a value of -1 start at the next element
        return head.next;
        }
}


/*
    you have two sorted lists | compare the first elements of each list and determine which is smaller | put the smaller
    of the 2 elements in the new list
    which ever list we took from we want to move the pointer forward
    Once we don't have 2 elements to compare we will have one less list | figure out which list this is | put the
    remaining elements of that list in the new list
 */
