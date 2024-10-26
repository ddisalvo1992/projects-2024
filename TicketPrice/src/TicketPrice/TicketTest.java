package TicketPrice;

public class TicketTest {
    public static void main(String[] args) {
        // Test case 1: Age 10 (Child)
        Ticket ChildTicket = new ChildTicket();
        System.out.println("a) Child ticket (under 16) - $" + ChildTicket.calculatePrice());

        // Test case 2: Age 70 with AARP discount (Senior)
        Ticket SeniorTicket = new SeniorTicket(true);
        System.out.println("b) Senior ticket (over 64) - $" + SeniorTicket.calculatePrice() + " (if have AARP membership – 20% off)");

        // Test case 3: Age 23, not in the military (Adult)
        Ticket AdultTicketNoMilitary = new AdultTicket(false);
        System.out.println("c) Adult ticket - $" + AdultTicketNoMilitary.calculatePrice());

        // Test case 4: Age 23, in the military (Adult)
        Ticket AdultTicketMilitary = new AdultTicket(true);
        System.out.println("   (if in the military – 10% off)");
    }
}
