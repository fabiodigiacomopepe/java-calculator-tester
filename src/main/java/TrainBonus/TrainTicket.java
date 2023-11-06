package TrainBonus;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        // Inizializzo lo scanner da tastiera
        Scanner scan = new Scanner(System.in);

        // Chiedo all'utente i km da percorrere e l'età
        System.out.print("Inserisci i km da percorrere: ");
        String kmTicket = scan.nextLine();
        double kmTicketDouble = Double.parseDouble(kmTicket);   // Trasformo da stringa a decimale
        System.out.print("Inserisci la tua età: ");
        String userAge = scan.nextLine();
        int userAgeInt = Integer.parseInt(userAge);             // Trasformo da stringa a intero

        Ticket t = new Ticket(kmTicketDouble, userAgeInt);

        double prezzoFinale = t.finalPrice();
        System.out.println("Prezzo finale: " + prezzoFinale + "€");

        // Chiudo lo scanner da tastiera
        scan.close();
    }
}
