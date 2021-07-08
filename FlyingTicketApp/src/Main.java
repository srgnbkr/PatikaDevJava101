import business.concretes.TicketManager;
import business.concretes.TicketValidationManager;
import entities.Ticket;

public class Main {

	public static void main(String[] args) {
		TicketManager ticketManager = new TicketManager(new TicketValidationManager());
		ticketManager.buy(new Ticket(550,11,2));
		ticketManager.buy(new Ticket(8745,25,1));
		
		ticketManager.buy(new Ticket(6545,66,1));
	}

}
