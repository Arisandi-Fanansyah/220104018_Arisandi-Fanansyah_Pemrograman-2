package com.arisandif.pbo.modul5.Percobaan.Sekolah;

import com.arisandif.pbo.modul5.Percobaan.Mahasiswa;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public Kelas (int kode, String nama){
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void setMahasiswa(Mahasiswa mhs){
        this.mahasiswa = mhs;
    }
}
