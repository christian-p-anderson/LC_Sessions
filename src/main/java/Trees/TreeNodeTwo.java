/*
    Associated with SymmetricTree
 */

package Trees;

public class TreeNodeTwo {
    int val;
    TreeNodeTwo left;
    TreeNodeTwo right;
    TreeNodeTwo() {}
    TreeNodeTwo(int val) { this.val = val; }
    TreeNodeTwo(int val, TreeNodeTwo left, TreeNodeTwo right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
