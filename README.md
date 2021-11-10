# 20104018_Arisandi-Fanansyah_Pemrograman-2

# Modul 5 : MENGELOLA CLASS

# Dasar Teori

- Package

  Package adalah suatu cara untuk memenejement class-class yang kita buat pakage akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package. Berikut ini adalah sintak pernyataan package untuk meletakkan hasil kompilasi sebuah kelas ke dalam paket :

  ```java
  package nama-paket;
  <identifier> class <nama_class sama dengan package>
  Contoh : package Utama;
  public class Utama{
  }
  ```

- Import Class

  Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut.

  Deklarasi import class :

  ```java
  import <nama_package>.*;
  Contoh : import matematik.*;
  ```
  Sedangkan untuk mengimpor class tertentu anda dapat menuliskan nama class setelah nama package. Deklarasi import :

  ```java
  import <nama_package>.<nama_class>;
  Contoh : import matematik.bilangan;
  ```
  
  Contoh penggunaan import (dengan implementasinya):
  ```java
  import matematik.bilangan;
  class Utama {
  public static void main(String[] args) {
  Bilangan x = new Bilangan();
  x.setDesimal(- 44);
  System.out.println("Bilangan biner dari " + x.getDesimal() + " adalah "+ x.biner());
  }
  }
  ```

- Kata kunci this

  Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. Adapun format penulisannya adalah:

  ```java
  this.data_member        
  ```
  Merujuk pada data member
  ```java
  this.function_member()
  ```
  Merujuk pada function member
  ```java
  this()
  ```
  Merujuk pada konstruktor

# PRAKTIKUM

Mengimplementasikan UML class diagram dalam program untuk package perbankan
Transformasikan class diagram diatas ke dalam bentuk program! Tulislah listing program berikut ini sebagai pengetesan.
```
Perbankan
```
```
Nasabah
- namaAwal : String
- namaAkhir : String
- tabungan : Tabungan
+ Nasabah (namaAwal : String,
namaAkhir : String)
+ getNamaAwal() : String
+ getNamaAkhir () : String
+ getTabungan() : Tabungan
+ setTabungan (tabungan : tabungan)
```
```
has
```
```
Tabungan
- saldo : int
+ Tabungan(saldo : int)
+ getSaldo() : int
+ ambilUang(jumlah : int) :
boolean
+ simpanUang(jumlah : int)
```

```java
import perbankan.*;
private class TesLatihan {
private static void main(String args[]) {
int tmp;
boolean status;
Nasabah nasabah=new Nasabah("Agus","Daryanto");
System.out.println("Nasabah atas nama : " +
nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());
nasabah.setTabungan(new Tabungan(5000));
tmp=nasabah.getTabungan().getSaldo();
System.out.println("Saldo awal : " + tmp);
nasabah.getTabungan().simpanUang(3000);
System.out.println("Jumlah uang yang disimpan : 3000");
status=nasabah.getTabungan().ambilUang(6000);
System.out.print("Jumlah uang yang diambil : 6000");
if (status) System.out.println(" ok");
else
System.out.println(" gagal");
nasabah.getTabungan().simpanUang(3500);
System.out.println("Jumlah uang yang disimpan : 3500");
status=nasabah.getTabungan().ambilUang(4000);
System.out.print("Jumlah uang yang diambil : 4000");
if (status) System.out.println(" ok");
else
System.out.println(" gagal");
status=nasabah.getTabungan().ambilUang(1600);
System.out.print("Jumlah uang yang diambil : 1600");
if (status) System.out.println(" ok");
else
System.out.println(" gagal");
nasabah.getTabungan().simpanUang(2000);
System.out.println("Jumlah uang yang disimpan : 2000");
tmp=nasabah.getTabungan().getSaldo();
System.out.println("Saldo sekarang = " + tmp);} }
```
Lakukan kompilasi pada program diatas dan jalankan. Jika tampilan di layar tampak seperti dibawah ini, maka program anda sudah benar. Jika tidak sama, benahi kembali program anda dan lakukan hal yang sama seperti diatas.

### Jawaban

Jawaban ada pada folder [Latihan](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/tree/Modul5/Latihan) dan berikut hasil runnya : 

```
Nasabah atas nama : Agus Daryanto
Saldo awal : 5000
Jumlah uang yang disimpan 3000
Jumlah uang yang diambil 6000 OK
Jumlah uang yang disimpan 3500
Jumlah uang yang diambil 4000 OK
Jumlah uang yang diambil 1600 Gagal
Jumlah uang yang disimpan 2000
Saldo sekarang = 3500
```

# KESIMPULAN

Kesimpulannya yaitu saya dapat memahami konsep pada package dan import. dapat menggunakan kata kunci dalam this. dan juga dapar mengimplementasikan apa yang dipraktekkan oleh asdos dalam praktikum.
