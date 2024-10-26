package TicketPrice;

public class NoDiscount implements DiscountBehavior {
    @Override
    public double applyDiscount(double price) {
        return price; // No discount
    }
}
