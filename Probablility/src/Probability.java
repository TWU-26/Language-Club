public class Probability {
    private int denominator;
    private int numerator;

    public Probability(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public boolean isProbable() {
        return true?((double)numerator / denominator >0.5):false;
    }

    public boolean isImprobable() {
        return !this.isProbable();
    }
}
