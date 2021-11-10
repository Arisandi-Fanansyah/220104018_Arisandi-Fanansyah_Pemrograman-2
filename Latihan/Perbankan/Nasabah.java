package com.arisandif.pbo.modul5.Latihan.Perbankan;

public class Nasabah {
    public String namaAwal;
    public String namaAkhir;
    public Tabungan tabungan;

    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }

    public String getNamaAwal(){
        return namaAwal;
    }
    public String getNamaAkhir(){
        return namaAkhir;
    }

    public Tabungan getTabungan(){
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
}
