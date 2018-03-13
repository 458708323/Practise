package BinaryTree;

//二叉排序树
public class BinaryTreeManager {

    private Node root;//根节点

    public void add(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            root.addNode(data);
        }
    }

    public void print() {
        root.print();
    }

    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        public void addNode(int data) {
            //如果data<this.data 则放在左子树  否则在右子树
            if (data < this.data) {
                if (this.left == null) {
                    this.left = new Node(data);
                } else {
                    left.addNode(data);
                }
            } else {
                if (this.right == null) {
                    this.right = new Node(data);
                } else {
                    right.addNode(data);
                }
            }
        }

        //中序遍历
        public void print() {
            if (this.left != null) {
                this.left.print();
            }
            System.out.print(data);
            System.out.println();
            if (this.right != null) {
                this.right.print();
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeManager binaryTreeManager = new BinaryTreeManager();
        binaryTreeManager.add(4);
        binaryTreeManager.add(6);
        binaryTreeManager.add(1);
        binaryTreeManager.add(100);
        binaryTreeManager.add(101);
        binaryTreeManager.add(2);
        binaryTreeManager.add(2);
        binaryTreeManager.print();
    }
}

