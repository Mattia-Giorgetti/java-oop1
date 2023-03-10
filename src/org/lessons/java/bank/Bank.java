package org.lessons.java.bank;

import java.util.Objects;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double importo;
        int rispostaUtente;
        boolean exit = false;

        System.out.println("Benvenuto! Inserisci il tuo nome");
        String userName = scan.nextLine();

        Conto bankaccount = new Conto(userName);
        System.out.println(bankaccount);

        do {
            System.out.println("Cosa vuoi fare? Premi 1 per deposito, Premi 2 per prelievo, Premi 3 per uscire");
            rispostaUtente = Integer.parseInt(scan.nextLine());

            if (rispostaUtente == 1){
                System.out.println("Quando vuoi inserire?");
                importo = Double.parseDouble(scan.nextLine());
                bankaccount.deposita(importo);
                System.out.println("Saldo aggiornato: " + bankaccount.getSaldo());
            } else if (rispostaUtente == 2){
                System.out.println("Quanto vuoi prelevare?");
                importo = Double.parseDouble(scan.nextLine());
                bankaccount.preleva(importo);
                System.out.println(bankaccount.getSaldo() >= 0 ? "Saldo aggiornato: " + bankaccount.getSaldo() : "");

            } else if (rispostaUtente == 3) {
                System.out.println("Arrivederci");
            } else {
                System.out.println("comando non riconosciuto");
            }
        } while (rispostaUtente != 3);
    }
}
