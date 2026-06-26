package exception;

public class OrderAlreadyCancelledException extends OrderException {

    public static final String ERROR_CODE = "ORD-002";

    public OrderAlreadyCancelledException(String message) {
        super(message);
    }
}