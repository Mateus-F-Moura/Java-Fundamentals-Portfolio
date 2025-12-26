package OopPrincipals.Dollar;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convert(double pricePerDollar, double amountDollars) {
        if (pricePerDollar <= 0.0) throw new IllegalArgumentException("pricePerDollar must be > 0");
        if (amountDollars <= 0.0) throw new IllegalArgumentException("amountDollars must be > 0");

        return (pricePerDollar * amountDollars) + IOF;
    }

}