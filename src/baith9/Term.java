package baith9;

class Term {
    int exponent;
    double coefficient;
    Term next;

    public Term(int exponent, double coefficient) {
        this.exponent = exponent;
        this.coefficient = coefficient;
        this.next = null;
    }
}
