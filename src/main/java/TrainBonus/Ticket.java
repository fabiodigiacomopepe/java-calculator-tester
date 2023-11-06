package TrainBonus;

import java.math.BigDecimal;

public class Ticket {
    // ATTRIBUTI
    private double kmTicket;
    private int userAge;
    private static double euroKm = 0.21;

    // COSTRUTTORE
    public Ticket(double kmTicket, int userAge) throws IllegalArgumentException {
        if (kmTicket <= 0) {
            throw new IllegalArgumentException("Il numero dei km non può essere 0 o negativo.");
        }
        if (userAge <= 0) {
            throw new IllegalArgumentException("L'età non può essere 0 o negativa.");
        }
        this.kmTicket = kmTicket;
        this.userAge = userAge;
    }

    // GETTER E SETTER
    public double getKmTicket() {
        return kmTicket;
    }

    public void setKmTicket(double kmTicket) {
        if (kmTicket <= 0) {
            throw new IllegalArgumentException("Il numero dei km non può essere 0 o negativo.");
        }
        this.kmTicket = kmTicket;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        if (userAge <= 0) {
            throw new IllegalArgumentException("L'età non può essere 0 o negativa.");
        }
        this.userAge = userAge;
    }

    // METODI
    public double finalPrice() {
        double finalPrice = 0;
        double calcPrice = kmTicket * euroKm;
        if (userAge < 18) { // Sconto minorenni
            finalPrice = calcPrice - (calcPrice * 0.20);
        } else if (userAge > 65) { // Sconto over 65
            finalPrice = calcPrice - (calcPrice * 0.40);
        } else { // Prezzo pieno
            finalPrice = calcPrice;
        }
        finalPrice = Math.round(finalPrice * 100.0) / 100.0; // Arrotondo a 2 cifre dopo la virgola
        return finalPrice;
    }
}
