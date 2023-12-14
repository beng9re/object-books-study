package org.example.ch1.step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ticketoffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public Ticketoffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
