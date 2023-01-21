package ru.netology;

import java.util.Arrays;

public class TicketManager {
    TicketRepository repository;

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    public void add(Ticket ticket) {
        repository.add(ticket);
    }

    public Ticket[] findAll(String depAir, String arrAir) {
        Ticket[] result = new Ticket[0]; // тут будем хранить подошедшие запросу продукты
        for (Ticket ticket : repository.findAll()) {
            if (matches(ticket, depAir, arrAir)) {
                // "добавляем в конец" массива result продукт product
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(Ticket ticket, String depAir, String arrAir) {
        if (ticket.getDepAir().equals(depAir)) {
            if (ticket.getArrAir().equals(arrAir)) {
                return true;
            }
        }
        return false;
    }
}