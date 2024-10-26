package TicketPrice;

public class MilitaryDiscount implements DiscountBehavior {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% discount
    }
}
