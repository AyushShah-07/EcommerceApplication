package app;
 
import exception.*;
import model.Order;
import model.Product;
import service.OrderService;
 
public class Main {
 
    public static void main(String[] args) {
 
        OrderService service = new OrderService();
 
        Product product = new Product(101, "Laptop", 5, 50000);
 
        Order order = new Order(201, false, true);
 
        // Test Product Exception
        try {
            service.placeOrder(product, 10);
        } catch (ProductException e) {
            System.out.println("Product Error : " + e.getMessage());
        }
 
        // Test Order Exception
        try {
            service.cancelOrder(order);
        } catch (OrderException e) {
            System.out.println("Order Error : " + e.getMessage());
        }
 
        // Test Return Exception
        try {
            service.returnOrder(order);
        } catch (OrderException e) {
            System.out.println("Return Error : " + e.getMessage());
        }
 
        // Test Payment Exception
        try {
            service.processPayment(10000, 5000);
        } catch (PaymentException e) {
            System.out.println("Payment Error : " + e.getMessage());
        }
 
        // Test Unchecked Exception
        try {
            throw new PaymentGatewayException(
                    "Payment Gateway Server Down",
                    new RuntimeException("Connection Timeout"));
        } catch (PaymentGatewayException e) {
            System.out.println("System Error : " + e.getMessage());
            System.out.println("Cause : " + e.getCause());
        }
    }
}