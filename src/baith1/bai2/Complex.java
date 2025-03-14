package baith1.bai2;

public class Complex {
    private double real;  // Phần thực
    private double imag;  // Phần ảo

    // Phương thức khởi tạo không có tham số (mặc định là 0 + 0i)
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    // Phương thức khởi tạo với một số thực (phần ảo mặc định là 0)
    public Complex(double real) {
        this.real = real;
        this.imag = 0;
    }

    // Phương thức khởi tạo với hai số thực
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Phương thức khởi tạo sao chép từ một số phức khác
    public Complex(Complex other) {
        this.real = other.real;
        this.imag = other.imag;
    }

    // Getter và Setter cho phần thực
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    // Getter và Setter cho phần ảo
    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // Phương thức cộng hai số phức
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    // Phương thức trừ hai số phức
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    // Phương thức nhân hai số phức
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imag * other.imag;
        double newImag = this.real * other.imag + this.imag * other.real;
        return new Complex(newReal, newImag);
    }

    // Phương thức chia hai số phức
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imag * other.imag;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double newReal = (this.real * other.real + this.imag * other.imag) / denominator;
        double newImag = (this.imag * other.real - this.real * other.imag) / denominator;
        return new Complex(newReal, newImag);
    }

    // Phương thức hiển thị số phức dưới dạng a + bi
    public void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }
}
