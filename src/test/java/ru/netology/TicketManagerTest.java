package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {

    @Test
    void add() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket_1 = new Ticket(1, 1000, "MSK", "STW", 200);
        Ticket ticket_2 = new Ticket(2, 2000, "GDZ", "GRV", 100);
        Ticket ticket_3 = new Ticket(3, 1500, "STW", "RVI", 300);
        Ticket ticket_4 = new Ticket(4, 1200, "GDZ", "STW", 400);
        Ticket ticket_5 = new Ticket(5, 5000, "MSK", "STW", 700);
        Ticket ticket_6 = new Ticket(5, 100, "MSK", "RVI", 700);
        Ticket ticket_7 = new Ticket(5,354 , "RVI", "STW", 700);
        Ticket ticket_8 = new Ticket(5, 213, "MSK", "STW", 700);

        manager.add(ticket_1);
        manager.add(ticket_2);
        manager.add(ticket_3);
        manager.add(ticket_4);
        manager.add(ticket_5);
        manager.add(ticket_6);
        manager.add(ticket_7);
        manager.add(ticket_8);

        Ticket[] actual = manager.findAll("MSK", "STW");
        Ticket[] expected = {ticket_8, ticket_1, ticket_5};
        Assertions.assertArrayEquals(actual, expected);


    }

}