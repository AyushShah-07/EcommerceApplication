package exception;

public class ProductNotFoundException extends ProductException {

    public static final String ERROR_CODE = "PROD-001";

    public ProductNotFoundException(String message) {
        super(message);
    }
}