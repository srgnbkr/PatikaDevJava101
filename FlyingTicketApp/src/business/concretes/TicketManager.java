package business.concretes;

import java.text.DecimalFormat;

import business.abstracts.TicketService;
import business.abstracts.TicketValidationService;
import entities.Ticket;

public class TicketManager implements TicketService {
	double price;
	DecimalFormat decimalFormat = new DecimalFormat( "###,###.00");
	TicketValidationService ticketValidationService;
	
	
	

	public TicketManager(TicketValidationService ticketValidationService) {
		super();
		this.ticketValidationService = ticketValidationService;
	}

	


	@Override
	public void buy(Ticket ticket) {
		price = ticket.getDistance() * 0.10;
		
		if(ticketValidationService.validate(ticket)==true) {
			if(ticket.getType()==1) {
				if(ticket.getAge()<12) {
					System.out.println("Bilet Ücreti :"+decimalFormat.format(price/2)+" TL");
				}else if(ticket.getAge()>=12 && ticket.getAge()<25) {
					System.out.println("Bilet Ücreti :"+decimalFormat.format((price) - (price * 0.1))+" TL");
				}else if(ticket.getAge()>65) {
					System.out.println("Bilet Ücreti :"+decimalFormat.format((price) - price * 0.3)+" TL");
				}else {
					System.out.println("Bilet Ücreti :"+decimalFormat.format(price)+" TL");
				}
			}else if(ticket.getType()==2) {
				price = ticket.getDistance() * 0.10 - (price*0.2);
				if(ticket.getAge()<12) {
					System.out.println("Bilet Ücreti :"+decimalFormat.format(price/2)+" TL");
				}else if(ticket.getAge()>=12 && ticket.getAge()<25) {
					System.out.println("Bilet Ücreti :"+decimalFormat.format((price) - (price * 0.1))+" TL");
				}else if(ticket.getAge()>65) {
					System.out.println("Bilet Ücreti :"+decimalFormat.format((price) - price * 0.3)+" TL");
				}else {
					System.out.println("Bilet Ücreti :"+decimalFormat.format(price)+" TL");
				}
				
			}
		}else {
			System.out.println("Geçersiz Dönüş Tipi Girdiniz");
		}
		
		
	}

}
