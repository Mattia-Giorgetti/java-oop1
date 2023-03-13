package org.lessons.java.shop;

import org.lessons.java.shop.Prodotto;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {

        String nome = "T-shirt";
        String descrizione = "Maglia bianca con scritte nere";
        BigDecimal price = new BigDecimal("10.99");

        Prodotto product1 = new Prodotto(nome, descrizione, price );
        System.out.println(product1);

//        Faccio modifiche con i setter

        product1.setDescrizione("Maglia nera");
        product1.setNome("Jumper");
        product1.setPrezzo(new BigDecimal("13.99"));

//        Ristampo il prodotto modificato

        System.out.println(product1.getNome());
        System.out.println(product1.getCodice());
        System.out.println(product1.getDescrizione());

        System.out.println("Il nome esteso è: " + product1.extendedName());
        System.out.println("Il prezzo senza iva è: " + product1.getPrezzo());
        System.out.println("Il prezzo con iva è: " + product1.prezzoIvato());


    }
}
