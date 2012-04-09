public class Probability {
    private int denominator;
    private int numerator;

    public Probability(int numerator, int denominator) {
        if (numerator > denominator || numerator < 0 || denominator < 0) throw new IllegalArgumentException("You're stupid");
        this.numerator = numerator;
        this.denominator = denominator;

    }

    private double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    public boolean isProbable() {
        return toDouble() > 0.5;
    }

    public boolean isImprobable() {
        return toDouble() < 0.5;
    }

    public Probability not() {
        return new Probability(denominator - numerator, denominator);
    }

    public Probability and(Probability probability) {
        return new Probability(numerator * probability.numerator, denominator * probability.denominator);
    }
    
    public int cross(Probability probability){
        return this.numerator * probability.denominator;
    }

    public Probability or(Probability probability) {
        return (this.not().and(probability.not())).not();
    }

    @Override
    public boolean equals(Object probability) {
        if (probability instanceof Probability)
            return (((Probability) probability).toDouble() == this.toDouble());

        return false;
    }

    @Override
    public int hashCode() {
        return numerator * 49 + denominator * 50;
    }
}
