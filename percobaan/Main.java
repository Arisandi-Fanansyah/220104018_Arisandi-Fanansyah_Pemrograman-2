package com.arisandif.pbo.modul4.percobaan;

public class Main {
    public static void main(String[] args) {
        tabungan saya = new tabungan("Barca", 50410420, 1000000, 12345);
        System.out.println("Nama \t : " + saya.getNama());
        System.out.println("No Rekening \t : " + saya.getNorekening());
        System.out.println("Saldo \t : " + saya.GetSaldo());
        System.out.println("Pin \t : " + saya.getPin());
    }
}
