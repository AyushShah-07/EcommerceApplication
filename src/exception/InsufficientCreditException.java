package exception;

public class InsufficientCreditException extends PaymentException {

    public static final String ERROR_CODE = "PAY-002";

    private double required;
    private double available;

    public InsufficientCreditException(String message,
                                       double required,
                                       double available) {

        super(message);

        this.required = required;
        this.available = available;
    }

    public double getRequired() {
        return required;
    }

    public double getAvailable() {
        return available;
    }
}