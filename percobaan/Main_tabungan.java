package com.arisandif.pbo.modul4.percobaan;

public class Main_tabungan {
    public static void main(String[] args) {
        tabungan saya = new tabungan("Barca", 23456);
        tabungan kamu = new tabungan("Manu", 12345, 10000, 22222);

        saya.setSaldo(100000);
        saya.setPin(11111);

        System.out.println("Saldo awal saya : " + saya.GetSaldo());
        System.out.println("Saldo awal kamu : " + kamu.GetSaldo());
        System.out.println("Nomor pin saya : " + saya.getPin());
        System.out.println("Nomor pin kamu : " + kamu.getPin());


    }
}
