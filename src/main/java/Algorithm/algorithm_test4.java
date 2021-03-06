package Algorithm;


/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class algorithm_test4 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public void print() {
            System.out.print(this.val+ " ");
            if (this.left != null) {
                this.left.print();
            }
            if (this.right != null) {
                this.right.print();
            }
        }

    }

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode treeNode = reBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return treeNode;
    }

    public TreeNode reBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode treeNode = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                treeNode.left = reBinaryTree(pre, startPre + 1, i - startIn + startPre, in, startIn, i - 1);
                treeNode.right = reBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return treeNode;
    }

    public static void main(String[] args) {
        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        algorithm_test4 test4 = new algorithm_test4();
        test4.reConstructBinaryTree(pre, in).print();
        System.out.println();
    }
}
