/*
    Associated with ConvertSortedArrToBinaryTree
 */

package Trees;

public class TreeNodeFour {
    int val;
    TreeNodeFour left;
    TreeNodeFour right;
    TreeNodeFour () {}
    TreeNodeFour (int val) { this.val = val; }
    TreeNodeFour (int val, TreeNodeFour left, TreeNodeFour right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
