package org.example.ch1.step1;

/**
 * 소극장 클래스
 * */
public class Theater {
    private final Ticketseller ticketSeller;

    public Theater(Ticketseller ticketseller) {
        this.ticketSeller = ticketseller;
    }

    /**
     * 소극장은 관람객의 가방을 열어 그 안에 초대장이 들어 있는지 살펴본다.
     * 가방 안에 초대장이 들어 있으면 판 매원은 매표소에 보관돼 있는 티켓을 관람객의 가방 안으로 옮긴다.
     * 가방 안에 초대장이 들어 있지 않다면 관 람객의 가방에서 티켓 금액만큼의 현금을 꺼내
     * 매표소에 적립한 후에 매표소에 보관돼 있는 티켓을 관람객의 가방 안으로 옮긴다.
     * */
    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketoffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketoffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketoffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
