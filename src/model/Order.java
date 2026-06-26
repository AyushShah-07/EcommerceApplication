package model;
 
public class Order {
 
    private int orderId;
    private boolean cancelled;
    private boolean eligibleForReturn;
 
    public Order(int orderId, boolean cancelled, boolean eligibleForReturn) {
        this.orderId = orderId;
        this.cancelled = cancelled;
        this.eligibleForReturn = eligibleForReturn;
    }
 
    public int getOrderId() {
        return orderId;
    }
 
    public boolean isCancelled() {
        return cancelled;
    }
 
    public boolean isEligibleForReturn() {
        return eligibleForReturn;
    }
}