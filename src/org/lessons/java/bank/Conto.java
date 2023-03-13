package org.lessons.java.bank;

import java.math.BigDecimal;
import java.util.Random;

public class Conto {

//    CAMPI
    private final int numeroConto;
    private String nomeProprietario;
    private BigDecimal saldo;

//    COSTRUTTORE

    public Conto(String nomeProprietario){
        Random rand = new Random();
        this.numeroConto = rand.nextInt(1,1000);
        this.nomeProprietario = nomeProprietario;
        this.saldo = new BigDecimal("0.00");
    }

//    GETTER SETTER

    public int getNumeroConto() {
        return numeroConto;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

//    METODI

    public void deposita(BigDecimal importo){
        if (importo.compareTo(new BigDecimal("0")) > 0){
            this.saldo = saldo.add(importo);
        } else {
            System.out.println("Importo non valido");
        }

    }
    public void preleva(BigDecimal importo){
        if(saldo.equals(new BigDecimal("0.00"))){
            System.out.println("Non puoi prelevare da un conto a 0");
        } else if (this.saldo.compareTo(importo) < 0){
            System.out.println("Non hai abbastanza disponibilità");
        } else {
            this.saldo = saldo.subtract(importo);
        }
    }

    @Override
    public String toString() {
        return "Numero Conto: " + numeroConto +
                ", Intestatario: '" + nomeProprietario + '\'' +
                ", Saldo: " + saldo + "€";
    }
}
