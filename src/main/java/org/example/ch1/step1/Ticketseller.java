package org.example.ch1.step1;

public class Ticketseller {
    private Ticketoffice ticketoffice;
    public Ticketseller(Ticketoffice ticketoffice) {
        this.ticketoffice = ticketoffice;
    }
    public Ticketoffice getTicketoffice() {
        return ticketoffice;
    }
}
