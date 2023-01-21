package ru.netology;

public class TicketRepository {
    Ticket[] tickets = new Ticket[0];

    public void add(Ticket tickets) {
        Ticket[] tmp = new Ticket[this.tickets.length + 1];
        for (int i = 0; i < this.tickets.length; i++) {
            tmp[i] = this.tickets[i];
        }
        tmp[tmp.length - 1] = tickets;
        this.tickets = tmp;
    }

    public Ticket[] findAll() {
        return tickets;
    }

}
