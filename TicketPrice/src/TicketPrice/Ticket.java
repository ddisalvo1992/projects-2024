package TicketPrice;

public abstract class Ticket {
    protected DiscountBehavior discountBehavior;
    protected double basePrice;

    public Ticket(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setDiscountBehavior(DiscountBehavior discountBehavior) {
        this.discountBehavior = discountBehavior;
    }

    public double calculatePrice() {
        return discountBehavior.applyDiscount(basePrice);
    }

    public abstract String getDescription();
}
