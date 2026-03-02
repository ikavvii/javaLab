class Rational {
    private int numerator;
    private int denominator;

    Rational() {
        numerator = 0;
        denominator = 1;
    }

    Rational(int p, int q) {
        numerator = p;
        denominator = q;
    }

    public Rational add(Rational n2) {
        Rational result = new Rational();
        int lcm = lcm(this.denominator, n2.denominator);
        result.numerator = (this.numerator * lcm / this.denominator) +
                (n2.numerator * lcm / n2.denominator);
        result.denominator = lcm;

        return result;
    }

    private int lcm(int x, int y) {
        return x / gcd(x, y) * y;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public Rational divide(Rational n2) {
        return new Rational(this.numerator * n2.denominator, this.denominator * n2.numerator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public String toString(int precisionDigits) {
        String format = "%." + precisionDigits + "f";
        return String.format(format, numerator / (double) denominator);
    }
}

public class RationalEx {
    public static void main(String[] args) {
        Rational num1 = new Rational(2, 3);
        Rational num2 = new Rational(1, 4);

        Rational num3 = num1.add(num2);
        System.out.println(num3);
        System.out.println(num1.add(num1));
        System.out.println(num3.toString(2));
        System.out.println(num1.divide(num2));
    }
}