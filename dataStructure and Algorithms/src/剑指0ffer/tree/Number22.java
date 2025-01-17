package 剑指0ffer.tree;

import java.util.ArrayList;

/**
 * @author goodtime
 * @create 2020-01-20 3:03 下午
 */
public class Number22 {
    public static void main(String[] args) {
        TreeNode22 x1 = new TreeNode22(1);
        TreeNode22 x2 = new TreeNode22(2);
        TreeNode22 x3 = new TreeNode22(3);
        TreeNode22 x4 = new TreeNode22(4);
        TreeNode22 x5 = new TreeNode22(5);
        TreeNode22 x6 = new TreeNode22(6);
        x1.left = x2;
        x1.right = x3;
        x2.left = x4;
        x2.right = x5;
        x5.left = x6;
        Solution22 solution22 = new Solution22();
        ArrayList<Integer> integers = solution22.PrintFromTopToBottom(x1);
        System.out.println(integers);
    }
}

class TreeNode22 {
    int val = 0;
    TreeNode22 left = null;
    TreeNode22 right = null;

    public TreeNode22(int val) {
        this.val = val;
    }
}

//造一个队列，把父节点的左右子节点，如果不为空，就追加到队列末尾，然后挨个遍历，退出遍历的条件是，i指针到了队列的末尾。
class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode22 root) {
        ArrayList<Integer> val = new ArrayList<Integer>();
        ArrayList<TreeNode22> treeNode4 = new ArrayList<>();
        treeNode4.add(root);
        if (root == null) {
            return val;
        }
        for (int i = 0; i < treeNode4.size(); i++) {
            val.add(treeNode4.get(i).val);
            if (treeNode4.get(i).left != null) {
                treeNode4.add(treeNode4.get(i).left);
            }
            if (treeNode4.get(i).right != null) {
                treeNode4.add(treeNode4.get(i).right);
            }
        }
        return val;
    }

}