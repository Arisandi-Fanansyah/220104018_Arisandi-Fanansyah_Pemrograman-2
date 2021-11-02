package com.arisandif.pbo.modul4.latihan;

public class Student_Recordexample {
    public static void main(String[] args) {
        Student_Record Wahyu = new Student_Record();
        Student_Record Ini = new Student_Record();
        Student_Record Nama = new Student_Record();

        Wahyu.setName("Wahyu");
        Ini.setName("Ini");
        Nama.setName("Nama");

        System.out.println(Wahyu.getName());
        System.out.println("Hitung = " + Student_Record.getStudentCount());
    }
}
