public class Probability {
    private int denominator;
    private int numerator;
    private final double decimalValue;

    public Probability(int numerator, int denominator) {
        if (numerator > denominator) throw new IllegalArgumentException("You're stupid");
        this.numerator = numerator;
        this.denominator = denominator;
        decimalValue = (double) this.numerator / this.denominator;
    }

    public boolean isProbable() {
        return decimalValue > 0.5;
    }

    public boolean isImprobable() {
        return decimalValue < 0.5;
    }

    public Probability not() {
        return new Probability(denominator - numerator, denominator);
    }

    @Override
    public boolean equals(Object probability) {
        if (probability instanceof Probability) {
            return (((Probability) probability).decimalValue == this.decimalValue);
        } else {
            return super.equals(probability);
        }
    }

    

}
