/*
    Given the root of a binary tree, return its maximum depth
    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the
    farthest leaf node.

    Input: root = [3, 9, 20, null, null, 15, 7]
    Output: 3
 */

package Trees;

public class MaxDepthBinaryTree {

    public int maxDepth(TreeNodeZero root) {
        //base case
        if (root == null) {
            return 0;
        } else {
            //compute the depth of each subtree
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);

            //use the larger depth
            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            } else {
                return (rightDepth + 1);
            }
        }
    }
}

/*

 */
