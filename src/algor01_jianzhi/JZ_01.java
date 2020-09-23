package algor01_jianzhi;

import java.util.Scanner;

class Node {
    public int element;
    public Node left;
    public Node right;
}

class BiTree {
    Node root;
    public BiTree() {
        this.root = null;
    }
}

public class JZ_01 {

    /**
     * 创建tree
     */
    public static Node create(Node node) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入节点的值：");
        int value = in.nextInt();

        if (value != 0) {
            node = new Node();
            node.element = value;
            node.left = create(node.left);
            node.right = create(node.right);
        } else {
            // node.left = null;
            // node.right = null;
            node = null;
        }
        return node;
    }

    public static void main(String[] args) {
        BiTree tree = new BiTree();
        tree.root = create(tree.root);
        System.out.println(tree.root);
        System.out.println(tree.root.element);
        System.out.println(tree.root.right.element);
    }
}