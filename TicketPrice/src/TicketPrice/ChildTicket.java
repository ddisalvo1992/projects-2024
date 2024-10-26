package TicketPrice;

public class ChildTicket extends Ticket {
    public ChildTicket() {
        super(10.0);
        this.discountBehavior = new NoDiscount();
    }

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
