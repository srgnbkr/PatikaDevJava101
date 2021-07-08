package business.abstracts;

import entities.Ticket;

public interface TicketValidationService {
	Boolean validate(Ticket ticket);

}
