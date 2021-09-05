/*
    Given the root of a binary tree, check whether it is a mirror of itself (i.e. symmetric around its center)

                   1
                /     \
               2       2
             /  \     /  \
            3    4   4    3

    Input: root = [1, 2, 2, 3, 4, 4, 3]
    Output: true

                   1
                /     \
               2       2
                \        \
                 3        3

    Input: root = [1, 2, 3, null, 3, null, 3]
    Output: false
 */

package Trees;

public class SymmetricTree {

    public boolean isSymmetric(TreeNodeTwo root) {

        //base case, if root double equals null
        //we don't actually have a tree, but it would technically be symmetric
        if (root == null) {
            return true;
        }

        //this is the recursion, where we would compare the first set of left and right nodes
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNodeTwo left, TreeNodeTwo right) {
        //base case
        //if both left and right double equals null return the result of left double equals right
        if (left == null || right == null) {
            return left == right;
        }

        //if the left and right val don't equal each other return false
        if (left.val != right.val) {
            return false;
        }

        //this is where we walk down the binary tree and compare nodes
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
