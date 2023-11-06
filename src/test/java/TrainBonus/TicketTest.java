package TrainBonus;

import model.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    @DisplayName("Set km")
    void setKmTicket() {
        assertThrows(IllegalArgumentException.class, () -> {
            Ticket t = new Ticket(20, 20);
            t.setKmTicket(-2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Ticket t = new Ticket(20, 20);
            t.setKmTicket(0);
        });
    }

    @Test
    @DisplayName("Set età")
    void setUserAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            Ticket t = new Ticket(20, 20);
            t.setUserAge(-2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Ticket t = new Ticket(20, 20);
            t.setUserAge(0);
        });
    }

    @Test
    @DisplayName("Calcolo prezzo finale")
    void finalPrice() {
        Ticket t = new Ticket(20, 20);
        assertEquals(4.20, t.finalPrice());
        t.setUserAge(16);
        assertEquals(3.36, t.finalPrice());
        assertNotEquals(4.20, t.finalPrice());
        t.setUserAge(80);
        assertEquals(2.52, t.finalPrice());
        assertNotEquals(4.20, t.finalPrice());

    }
}