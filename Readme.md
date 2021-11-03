# 20104018_Arisandi-Fanansyah_Pemrograman-2

# Modul 4 : DASAR PEMROGRAMAN BERIORIENTASI OBJEK

# Dasar Teori

Information Hiding adalah menyembunyikan atribut dan method suatu objek dari objek lain. Informasi dari suatu class disembunyikan agar anggota-anggota tersebut tidak dapat diakses dari luar. Adapun caranya adalah cukup dengan memberikan akses control private ketika mendeklarasikan suatu atribut atau method. Contoh :

```java
private int nilai;
```

Encapsulation (Enkapsulasi) adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu:

a. Information hiding.

b. Menyediakan suatu perantara (method) untuk pengaksesan data.

Contoh :

```java
public class Siswa {
private int nilai;
public void setnilai(int n) {
nilai=n;
}
}
```

Contructor (konstruktor) adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek. Beberapa karakteristik yang dimiliki oleh constructor:

a. Method constructor harus memiliki nama yang sama dengan nama class.

b. Tidak mengembalikan suatu nilai (tidak ada keyword return).

c. Satu class memiliki lebih dari satu constructor (overloading constructor).

d. Dapat ditambah access modifier public, private, protected maupun default.

e. Suatu constructor bisa dipanggil oleh constructor lain dalam satu class.

Struktur dari konstruktor yaitu :

```java
Class Nama_kelas {
Nama_kelas() //ini adalah constructor
{
//isi konstruktor
}
//isi dari kelas
}
```

Contoh :

```java
public class Siswa {
private int nilai;
private String nama;
public Siswa(int n, String m) {
nilai= n;
nama= m;}
}
```

Overloading Constructor merupakan suatu class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama. Contoh :

```java
public class Siswa {
private int nilai;
public Siswa() {
nilai=0;}
public Siswa(int n) {
nilai=n;}
}
```

Constructor tidak dapat dipanggil secara langsung, namun harus dipanggil dengan menggunakan operator new pada pembentukan sebuah class.

# PRAKTIKUM

- Student Record

Buatlah 2 class dalam project kalian kemudia beri nama dan isi sebagai berikut :

```
StudentRecord
```

```java
public class StudentRecord
{
private String name;
private String address;
private int age;
private double mathGrade;
private double englishGrade;
private double scienceGrade;
private double average;
private static int studentCount;
public String getName(){
return name;
}
public void setName( String temp ){
name = temp;
}
public double getAverage(){
double result = 0;
result = ( mathGrade+englishGrade+scienceGrade )/3;
return result;
}
public static int getStudentCount(){
return studentCount;
}
}
```

```
StudentRecordExample
```

```java
public class StudentRecordExample
{
public static void main( String[] args ){
StudentRecord Wahyu = new StudentRecord();
StudentRecord Ini = new StudentRecord();
StudentRecord Nama = new StudentRecord();
Wahyu.setName("Wahyu");
Ini.setName("Ini");
Nama.setName("Nama");
System.out.println( getName() );
System.out.println("Hitung="+StudentRecord.getStudentCount
()
);
}
}
```

Hasil dari running program diatas adalah sebagai berikut:

```
Wahyu 
Hitung = 0
```

Analisislah dan tentukan konsep apa saja yang digunakan (dari modul ini) serta mengapa hasil akhirnya seperti itu !
### Jawaban

Konsep yang digunakan dalam program tersebut menggunakan konsep : 

Enkapsulation dan Constructor, Karena disini membutuhkan class lain untuk memanggil hasil dari program yang dibuat, dan juga menyediakan perantara (method) dalam mengakses data.
Hasil akhirnya seperti itu karena pada [class](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul4/latihan/Student_Recordexample.java) untuk memanggil code pada [class](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul4/latihan/Student_Record.java) dan jadilah hasil akhir seperti diatas.

# KESIMPULAN

Yang saya dapat dari mempelajari Dasar Pemrograman Berorientasi Objek yaitu :

1. Dapat mempraktikan dari konsep-konsep yang diajarkan.

2. Dapat menerapkan konsep enkapsulasi pada class.

3. Dan dapat mendeklarasikan suatu konstruktor. 
