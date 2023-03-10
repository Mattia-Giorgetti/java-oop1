package org.lessons.java.bank;

import java.util.Random;

public class Conto {

//    CAMPI
    private final int numeroConto;
    private String nomeProprietario;
    private double saldo;

//    COSTRUTTORE

    public Conto(String nomeProprietario){
        Random rand = new Random();
        this.numeroConto = rand.nextInt(1,1000);
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0;
    }

//    GETTER SETTER

    public int getNumeroConto() {
        return numeroConto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

//    METODI

    public void deposita(double importo){
        this.saldo += importo;
    }
    public void preleva(double importo){
        if(saldo == 0){
            System.out.println("Non puoi prelevare da un conto a 0");
        } else if (this.saldo < importo){
            System.out.println("Non hai abbastanza disponibilità");
        } else {
            this.saldo -= importo;
        }
    }

    @Override
    public String toString() {
        return "Numero Conto: " + numeroConto +
                ", Intestatario: '" + nomeProprietario + '\'' +
                ", Saldo: " + saldo + "€";
    }
}
