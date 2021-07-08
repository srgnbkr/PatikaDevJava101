package business.concretes;

import business.abstracts.TicketValidationService;
import entities.Ticket;

public class TicketValidationManager implements TicketValidationService {

	@Override
	public Boolean validate(Ticket ticket) {
		
		if(ticket.getType() == 1 || ticket.getType() ==2) {
			return true;
			
		}
		return false;
	
	}

}
