package exception;

public class OrderNotEligibleException extends OrderException {

    public static final String ERROR_CODE = "ORD-003";

    public OrderNotEligibleException(String message) {
        super(message);
    }
}