package service;
 
import exception.*;
import model.Order;
import model.Product;
 
public class OrderService {
 
    public void placeOrder(Product product, int requestedQty)
            throws ProductException {
 
        if (product == null) {
            throw new ProductNotFoundException("Product not found.");
        }
 
        if (requestedQty > product.getQuantity()) {
            throw new OutOfStockException(
                    "Insufficient stock available.",
                    product.getProductId(),
                    requestedQty,
                    product.getQuantity());
        }
 
        System.out.println("Order placed successfully.");
    }
 
    public void cancelOrder(Order order)
            throws OrderException {
 
        if (order == null) {
            throw new OrderNotFoundException("Order not found.");
        }
 
        if (order.isCancelled()) {
            throw new OrderAlreadyCancelledException("Order is already cancelled.");
        }
 
        System.out.println("Order cancelled successfully.");
    }
 
    public void returnOrder(Order order)
            throws OrderException {
 
        if (!order.isEligibleForReturn()) {
            throw new OrderNotEligibleException("Order is not eligible for return.");
        }
 
        System.out.println("Return request accepted.");
    }
 
    public void processPayment(double requiredAmount, double availableCredit)
            throws PaymentException {
 
        if (availableCredit < requiredAmount) {
            throw new InsufficientCreditException(
                    "Insufficient credit.",
                    requiredAmount,
                    availableCredit);
        }
 
        System.out.println("Payment successful.");
    }
}