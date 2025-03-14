package baith2.bai1;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushing elements:");
        stack.display();

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after popping:");
        stack.display();

        System.out.println("Number of elements: " + stack.numOfElement());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

