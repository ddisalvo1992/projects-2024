package TicketPrice;

public class AdultTicket extends Ticket {
    public AdultTicket(boolean inMilitary) {
        super(20.0);
        this.discountBehavior = inMilitary ? new MilitaryDiscount() : new NoDiscount();
    }

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
