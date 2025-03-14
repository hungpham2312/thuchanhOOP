package baith2.bai1;

public class Stack {
    private Node top;  // Con trỏ đến đỉnh ngăn xếp
    private int size;  // Số phần tử trong Stack

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Đẩy một phần tử vào ngăn xếp
    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Lấy phần tử trên đỉnh Stack
    public int pop() {
        if (isEmpty()) {
            return -1;  // Ngăn xếp rỗng
        }
        int item = top.item;
        top = top.next;
        size--;
        return item;
    }

    // Kiểm tra ngăn xếp có rỗng không
    public boolean isEmpty() {
        return top == null;
    }

    // Trả về số phần tử hiện có trong Stack
    public int numOfElement() {
        return size;
    }

    // Hiển thị nội dung của Stack
    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
}

