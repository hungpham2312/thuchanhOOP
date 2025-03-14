package baith1.bai2;

public class TestComplex {
    public static void main(String[] args) {
        // Khởi tạo bằng constructor không tham số
        Complex c1 = new Complex();
        System.out.print("c1: ");
        c1.display();

        // Khởi tạo bằng constructor có 1 tham số (phần thực)
        Complex c2 = new Complex(3);
        System.out.print("c2: ");
        c2.display();

        // Khởi tạo bằng constructor có 2 tham số (phần thực, phần ảo)
        Complex c3 = new Complex(4, -2);
        System.out.print("c3: ");
        c3.display();

        // Khởi tạo bằng constructor sao chép
        Complex c4 = new Complex(c3);
        System.out.print("c4 (copy of c3): ");
        c4.display();

        // Cộng hai số phức
        Complex sum = c2.add(c3);
        System.out.print("c2 + c3 = ");
        sum.display();

        // Trừ hai số phức
        Complex diff = c2.subtract(c3);
        System.out.print("c2 - c3 = ");
        diff.display();

        // Nhân hai số phức
        Complex product = c2.multiply(c3);
        System.out.print("c2 * c3 = ");
        product.display();

        // Chia hai số phức
        Complex quotient = c2.divide(c3);
        System.out.print("c2 / c3 = ");
        quotient.display();
    }
}
