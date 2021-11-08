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

### Jawaban

# KESIMPULAN

