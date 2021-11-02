package com.arisandif.pbo.modul4.percobaan;

public class tabungan {
    private String nama;
    private int norekening;
    private int saldo;
    private int pin;

    tabungan(String nama, int norekening){
        this.nama = nama;
        this.norekening = norekening;
    }

    tabungan(String nama, int norekening, int saldo, int pin){
        this.nama = nama;
        this.norekening = norekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    public String getNama(){
        return  nama;
    }

    public int getNorekening(){
        return norekening;
    }

    public int GetSaldo(){
        return saldo;
    }

    public int getPin(){
        return pin;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public void setPin(int pin){
        this.pin = pin;
    }
}
