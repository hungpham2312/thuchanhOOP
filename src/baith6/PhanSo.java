package baith6;

import java.io.*;
import java.util.Scanner;

class PhanSo {
    private int tu;
    private int mau;

    // Tối giản phân số bằng cách chia cả tử và mẫu cho ước chung lớn nhất (GCD)
    private void toigian() {
        int gcd = gcd(Math.abs(tu), Math.abs(mau));
        tu /= gcd;
        mau /= gcd;
        if (mau < 0) { // Đưa dấu trừ về tử số
            tu = -tu;
            mau = -mau;
        }
    }

    // Hàm tính GCD (Ước số chung lớn nhất) bằng thuật toán Euclid
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Constructor - nếu mẫu số là 0 thì ném ngoại lệ
    public PhanSo(int n, int d) {
        if (d == 0) {
            throw new ArithmeticException("Mẫu số không thể bằng 0.");
        }
        this.tu = n;
        this.mau = d;
        toigian();
    }

    // Phép cộng hai phân số
    public final PhanSo add(final PhanSo a) {
        return new PhanSo(this.tu * a.mau + a.tu * this.mau, this.mau * a.mau);
    }

    // Phép trừ hai phân số
    public final PhanSo sub(final PhanSo a) {
        return new PhanSo(this.tu * a.mau - a.tu * this.mau, this.mau * a.mau);
    }

    // Phép nhân hai phân số
    public final PhanSo multiple(final PhanSo a) {
        return new PhanSo(this.tu * a.tu, this.mau * a.mau);
    }

    // Phép chia hai phân số - nếu chia cho 0 thì ném ngoại lệ
    public final PhanSo divide(final PhanSo a) {
        if (a.tu == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0.");
        }
        return new PhanSo(this.tu * a.mau, this.mau * a.tu);
    }

    // Đọc phân số từ file (Cấu trúc file: `tu mau`, cách nhau bởi khoảng trắng)
    public void input(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        if (scanner.hasNextInt()) {
            this.tu = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            int d = scanner.nextInt();
            if (d == 0) {
                scanner.close();
                throw new ArithmeticException("Dữ liệu trong file không hợp lệ: Mẫu số không thể bằng 0.");
            }
            this.mau = d;
        }
        scanner.close();
        toigian();
    }

    // Biểu diễn phân số dưới dạng chuỗi "tu/mau"
    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

