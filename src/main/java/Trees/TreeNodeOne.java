/*
    Associated wth ValidateBinarySearchTree
 */

package Trees;

public class TreeNodeOne {
    int val;
    TreeNodeOne left;
    TreeNodeOne right;
    TreeNodeOne() {}
    TreeNodeOne(int val) { this.val = val; }
    TreeNodeOne(int val, TreeNodeOne left, TreeNodeOne right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
