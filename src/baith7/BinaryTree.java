package baith7;

public class BinaryTree {
    Node root;

    // Phương thức duyệt cây tham số hóa thao tác xử lý
    public void traverse(Node node, String order) {
        if (node == null) return;
        switch (order) {
            case "preorder":
                System.out.print(node.value + " ");
                traverse(node.left, order);
                traverse(node.right, order);
                break;
            case "inorder":
                traverse(node.left, order);
                System.out.print(node.value + " ");
                traverse(node.right, order);
                break;
            case "postorder":
                traverse(node.left, order);
                traverse(node.right, order);
                System.out.print(node.value + " ");
                break;
        }
    }

    // Tính giá trị của cây biểu thức
    public int evaluate(Node node) {
        if (node == null) return 0;
        // Nếu là nút lá, chuyển thành số nguyên
        if (node.left == null && node.right == null) {
            return Integer.parseInt(node.value);
        }
        // Tính giá trị hai cây con
        int leftValue = evaluate(node.left);
        int rightValue = evaluate(node.right);

        // Thực hiện phép toán
        return switch (node.value) {
            case "+" -> leftValue + rightValue;
            case "-" -> leftValue - rightValue;
            case "*" -> leftValue * rightValue;
            case "/" -> (rightValue != 0 ? leftValue / rightValue : 0); // Tránh chia cho 0
            default -> 0;
        };
    }
}

