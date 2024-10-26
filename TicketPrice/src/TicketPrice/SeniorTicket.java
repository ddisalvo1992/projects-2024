package TicketPrice;

public class SeniorTicket extends Ticket {
    public SeniorTicket(boolean hasAarp) {
        super(15.0);
        this.discountBehavior = hasAarp ? new AarpDiscount() : new NoDiscount();
    }

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
