import org.example.AviaSouls;
import org.example.Ticket;
import org.example.TicketTimeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void aviaSoulsSortThree() {

        AviaSouls aviaSouls = new AviaSouls();


        Ticket ticket1 = new Ticket("St.Petersburg", "Paris", 50_000, 3, 15);
        Ticket ticket2 = new Ticket("St.Petersburg", "Paris", 45_000, 15, 3);
        Ticket ticket3 = new Ticket("St.Petersburg", "Paris", 70_000, 9, 21);
        Ticket ticket4 = new Ticket("Perm'", "Bali", 3_000, 12, 17);
        Ticket ticket5 = new Ticket("Bali", "EKB", 5_000, 3, 15);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Ticket[] expected = {ticket2, ticket1, ticket3};
        Ticket[] actual = aviaSouls.search("St.Petersburg", "Paris");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void aviaSoulsSortOne() {

        AviaSouls aviaSouls = new AviaSouls();


        Ticket ticket1 = new Ticket("St.Petersburg", "Paris", 50_000, 3, 15);
        Ticket ticket2 = new Ticket("St.Petersburg", "Paris", 45_000, 15, 3);
        Ticket ticket3 = new Ticket("St.Petersburg", "Paris", 70_000, 9, 21);
        Ticket ticket4 = new Ticket("Perm'", "Bali", 3_000, 12, 17);
        Ticket ticket5 = new Ticket("Bali", "EKB", 5_000, 3, 15);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Ticket[] expected = {ticket4};
        Ticket[] actual = aviaSouls.search("Perm'", "Bali");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void aviaSoulsSortComparatorThree() {

        AviaSouls aviaSouls = new AviaSouls();


        Ticket ticket1 = new Ticket("St.Petersburg", "Paris", 50_000, 3, 13);
        Ticket ticket2 = new Ticket("St.Petersburg", "Paris", 45_000, 15, 21);
        Ticket ticket3 = new Ticket("St.Petersburg", "Paris", 70_000, 9, 21);
        Ticket ticket4 = new Ticket("Perm'", "Bali", 3_000, 12, 17);
        Ticket ticket5 = new Ticket("Bali", "EKB", 5_000, 3, 15);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] expected = {ticket2, ticket1, ticket3};
        Ticket[] actual = aviaSouls.search("St.Petersburg", "Paris");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void aviaSoulsSortComparatorOne() {

        AviaSouls aviaSouls = new AviaSouls();


        Ticket ticket1 = new Ticket("St.Petersburg", "Paris", 50_000, 3, 13);
        Ticket ticket2 = new Ticket("St.Petersburg", "Paris", 45_000, 15, 21);
        Ticket ticket3 = new Ticket("St.Petersburg", "Paris", 70_000, 9, 21);
        Ticket ticket4 = new Ticket("Perm'", "Bali", 3_000, 12, 17);
        Ticket ticket5 = new Ticket("Bali", "EKB", 5_000, 3, 15);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] expected = {ticket5};
        Ticket[] actual = aviaSouls.search("Bali", "EKB");
        Assertions.assertArrayEquals(expected, actual);
    }


}
