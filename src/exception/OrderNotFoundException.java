package exception;

public class OrderNotFoundException extends OrderException {

    public static final String ERROR_CODE = "ORD-001";

    public OrderNotFoundException(String message) {
        super(message);
    }
}