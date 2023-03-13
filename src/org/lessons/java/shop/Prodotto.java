package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
//    CAMPI
    private final int codice;
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private final static BigDecimal IVA = BigDecimal.valueOf(0.22);

//    COSTRUTTORE
   public Prodotto(String nome, String descrizione, BigDecimal prezzo){
        Random rand = new Random();
        this.codice = rand.nextInt(1,10000);
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

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }


//    METODI

    public String extendedName(){
       return formattedCode() + nome;
    }
    public BigDecimal prezzoIvato(){
        return prezzo.add(prezzo.multiply(IVA).setScale(2, RoundingMode.HALF_EVEN));
    }
    public String formattedCode(){
       String codiceStr = String.valueOf(codice);
       while (codiceStr.length() < 8){
           codiceStr = "0" + codiceStr;
       }
       return codiceStr;
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
