package exception;

public class PriceChangedException extends ProductException {

    public static final String ERROR_CODE = "PROD-003";

    private double oldPrice;
    private double newPrice;

    public PriceChangedException(String message,
                                 double oldPrice,
                                 double newPrice) {

        super(message);

        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }
}