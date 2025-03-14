package baith7;

public class Main {
    public static void main(String[] args) {
        // Bài 1: Xây dựng cây nhị phân
        BinaryTree tree = new BinaryTree();
        tree.root = new Node("A");
        tree.root.left = new Node("B");
        tree.root.right = new Node("C");
        tree.root.left.left = new Node("D");
        tree.root.left.right = new Node("E");
        tree.root.right.right = new Node("F");
        tree.root.left.left.left = new Node("G");

        System.out.println("Preorder traversal:");
        tree.traverse(tree.root, "preorder");

        System.out.println("\nInorder traversal:");
        tree.traverse(tree.root, "inorder");

        System.out.println("\nPostorder traversal:");
        tree.traverse(tree.root, "postorder");

        // Bài 2: Xây dựng cây biểu thức số học (3 + ((2 * 4) - (8 / 2)))
        BinaryTree expressionTree = new BinaryTree();
        expressionTree.root = new Node("+");
        expressionTree.root.left = new Node("3");
        expressionTree.root.right = new Node("-");
        expressionTree.root.right.left = new Node("*");
        expressionTree.root.right.right = new Node("/");
        expressionTree.root.right.left.left = new Node("2");
        expressionTree.root.right.left.right = new Node("4");
        expressionTree.root.right.right.left = new Node("8");
        expressionTree.root.right.right.right = new Node("2");

        System.out.println("Expression Tree:");
        expressionTree.traverse(expressionTree.root,"inorder");
        System.out.println("\nExpression Tree Value: " + expressionTree.evaluate(expressionTree.root));
    }
}

