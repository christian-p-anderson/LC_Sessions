/*
    Given the root of a binary tree, determine if it is a valid binary search tree (BST)

    A valid BST is defined as follows:
        The left subtree of a node contains only nodes with keys less than the node's key
        The right subtree of a node contains only nodes with keys greater than the node's key
        Both the left and right subtrees must also be binary search trees

         2
        / \
       1   3

    Input: root = [2, 1, 3]
    Output: true

         5
        / \
       1   4
          / \
         3   6
    Input: root = [5, 1, 4, null, null, 3, 6]
    Output: false
    Explanation: The root node's value is 5 but its right child's value is 4
 */

package Trees;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNodeOne root) {
        Deque<TreeNodeOne> stack = new ArrayDeque<>();
        Integer prev = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();

            //if next element in ind order traversal is smaller than the previous one that's not a BST
            if (prev != null && root.val <= prev) {
                return false;
            }
            prev = root.val;
            root = root.right;
        }
        return true;
    }
}
