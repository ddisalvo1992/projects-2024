package TicketPrice;

public class AarpDiscount implements DiscountBehavior {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% discount
    }
}
