/*
    Associated with MaxDepthBinaryTree
 */

package Trees;

public class TreeNodeZero {
    int val;
    TreeNodeZero left;
    TreeNodeZero right;
    TreeNodeZero() {}
    TreeNodeZero(int val) { this.val = val; }
    TreeNodeZero(int val, TreeNodeZero left, TreeNodeZero right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
