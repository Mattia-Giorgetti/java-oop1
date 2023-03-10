package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
//    CAMPI
    private final int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private final static double IVA = 0.22;

//    COSTRUTTORE
   public Prodotto(String nome, String descrizione, double prezzo){
        Random rand = new Random();
        this.codice = rand.nextInt(1,100);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }


//    GETTER SETTER

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }


//    METODI

    public String extendedName(){
       return codice + nome;
    }
    public String prezzoIvato(){

       DecimalFormat df = new DecimalFormat("###,###.00");
        return df.format(prezzo * (1 + IVA));
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
