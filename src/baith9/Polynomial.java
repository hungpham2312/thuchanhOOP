package baith9;

class Polynomial {
    private Term head;

    public Polynomial() {
        this.head = null;
    }

    public void addTerm(int exponent, double coefficient) {
        if (coefficient == 0) return;
        Term newTerm = new Term(exponent, coefficient);
        if (head == null || head.exponent < exponent) {
            newTerm.next = head;
            head = newTerm;
            return;
        }
        Term current = head, prev = null;
        while (current != null && current.exponent > exponent) {
            prev = current;
            current = current.next;
        }
        if (current != null && current.exponent == exponent) {
            current.coefficient += coefficient;
            if (current.coefficient == 0) {
                if (prev != null) prev.next = current.next;
                else head = current.next;
            }
        } else {
            newTerm.next = current;
            if (prev != null) prev.next = newTerm;
        }
    }

    public void multiplyTerm(int exponent, double coefficient) {
        if (coefficient == 0) {
            head = null;
            return;
        }
        Term current = head;
        while (current != null) {
            current.coefficient *= coefficient;
            current.exponent += exponent;
            current = current.next;
        }
    }

    public Polynomial addPolynomial(Polynomial other) {
        Polynomial result = new Polynomial();
        Term t1 = this.head, t2 = other.head;
        while (t1 != null || t2 != null) {
            if (t1 == null) {
                result.addTerm(t2.exponent, t2.coefficient);
                t2 = t2.next;
            } else if (t2 == null) {
                result.addTerm(t1.exponent, t1.coefficient);
                t1 = t1.next;
            } else if (t1.exponent == t2.exponent) {
                result.addTerm(t1.exponent, t1.coefficient + t2.coefficient);
                t1 = t1.next;
                t2 = t2.next;
            } else if (t1.exponent > t2.exponent) {
                result.addTerm(t1.exponent, t1.coefficient);
                t1 = t1.next;
            } else {
                result.addTerm(t2.exponent, t2.coefficient);
                t2 = t2.next;
            }
        }
        return result;
    }

    public double evaluate(double x) {
        double result = 0;
        Term current = head;
        while (current != null) {
            result += current.coefficient * Math.pow(x, current.exponent);
            current = current.next;
        }
        return result;
    }

    public void printPolynomial() {
        if (head == null) {
            System.out.println("0");
            return;
        }
        Term current = head;
        StringBuilder sb = new StringBuilder();
        while (current != null) {
            if (current.coefficient > 0 && current != head) sb.append(" + ");
            if (current.coefficient < 0) sb.append(" - ");
            sb.append(Math.abs(current.coefficient));
            if (current.exponent > 0) sb.append("x");
            if (current.exponent > 1) sb.append("^").append(current.exponent);
            current = current.next;
        }
        System.out.println(sb);
    }
}

