package exception;

public class OutOfStockException extends ProductException {

    public static final String ERROR_CODE = "PROD-002";

    private int productId;
    private int requestedQty;
    private int availableQty;

    public OutOfStockException(String message,
                               int productId,
                               int requestedQty,
                               int availableQty) {

        super(message);

        this.productId = productId;
        this.requestedQty = requestedQty;
        this.availableQty = availableQty;
    }

    public int getProductId() {
        return productId;
    }

    public int getRequestedQty() {
        return requestedQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }
}