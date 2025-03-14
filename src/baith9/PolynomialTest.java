package baith9;

public class PolynomialTest {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.addTerm(3, 5.3);
        p1.addTerm(1, -1.2);
        p1.addTerm(0, 123.5);
        System.out.print("Polynomial p1: ");
        p1.printPolynomial();

        Polynomial p2 = new Polynomial();
        p2.addTerm(2, 3.1);
        p2.addTerm(1, 2.4);
        p2.addTerm(0, -50);
        System.out.print("Polynomial p2: ");
        p2.printPolynomial();

        Polynomial sum = p1.addPolynomial(p2);
        System.out.print("Sum p1 + p2: ");
        sum.printPolynomial();

        System.out.println("Value of p1 at x = 2: " + p1.evaluate(2));
    }
}

