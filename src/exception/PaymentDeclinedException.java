package exception;
public class PaymentDeclinedException extends PaymentException {
    public static final String ERROR_CODE = "PAY-001";
    private String reason;
    public PaymentDeclinedException(String message, String reason) {
        super(message);
        this.reason = reason;
    }
    public String getReason() {
        return reason;
    }
}