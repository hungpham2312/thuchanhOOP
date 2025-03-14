package baith6;

import java.io.IOException;

public class TestPhanSo {
    public static void main(String[] args) {
        try {
            // Khởi tạo hai phân số
            PhanSo ps1 = new PhanSo(3, 4);
            PhanSo ps2 = new PhanSo(2, 5);

            // Thực hiện các phép toán
            System.out.println("Phân số 1: " + ps1);
            System.out.println("Phân số 2: " + ps2);
            System.out.println("Tổng: " + ps1.add(ps2));
            System.out.println("Hiệu: " + ps1.sub(ps2));
            System.out.println("Tích: " + ps1.multiple(ps2));
            System.out.println("Thương: " + ps1.divide(ps2));

            // Đọc phân số từ file (ví dụ file "phanSo.txt" chứa: `6 8`)
            PhanSo ps3 = new PhanSo(1, 1);
            ps3.input("D:/bkav/thuchanh/src/phanSo.txt");
            System.out.println("Phân số đọc từ file: " + ps3);
            PhanSo ps4 = new PhanSo(2,0);

        } catch (ArithmeticException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

