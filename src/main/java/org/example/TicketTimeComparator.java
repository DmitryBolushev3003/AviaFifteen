package org.example;

import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {


    @Override
    public int compare(Ticket o1, Ticket o2) {
        int timeTicket1 = o1.getTimeFrom() - o1.getTimeTo();
        int timeTicket2 = o2.getTimeFrom() - o2.getTimeTo();
        if (timeTicket1 < timeTicket2) {
            return -1;
        } else if (timeTicket1 > timeTicket2) {
            return 1;
        } else {
            return 0;
        }
    }
}

