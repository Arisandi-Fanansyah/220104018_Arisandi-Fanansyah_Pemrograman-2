# 20104018_Arisandi-Fanansyah_Pemrograman-2

# Modul 5 : KONSEP INHERITANCE

# Dasar Teori

  Dengan konsep inheritance, sebuah class dapat mempunyai class turunan. Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class turunan itu sendiri seringkali disebut subclass atau child class. Suatu subclass dapat mewarisi apa-apa yang dipunyai oleh parent class-nya. Kesimpulannya, boleh dikatakan bahwa suatu subclass adalah tidak lain hanya memperluas (extend) parent class-nya. Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya. Berikut adalah contoh deklarasi inheritance.

Contoh:
```java
public class B extends A {
...
}
```
  Contoh diatas memberitahukan kompiler Java bahwa kita ingin mengextend class A ke class B. Dengan kata lain, class B adalah subclass (class turunan) dari class A, sedangkan class A adalah parent class dari class B.
  Java hanya memperkenankan adanya single inheritance. Konsep single inheritance hanya memperbolehkan suatu sublass mempunyai satu parent class. Dengan konsep single inheritance ini, masalah pewarisan akan dapat diamati dengan mudah.
  Suatu parent class dapat tidak mewariskan sebagian member-nya kepada subclass-nya. Sejauh mana suatu member dapat diwariskan ke class lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan dengan access control (kontrol pengaksesan). Di dalam java, kontrol pengaksesan dapat digambarkan dalam tabel berikut ini:

  Kata kunci super dipakai untuk merujuk pada member dari parent class, sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri.
  Ada beberapa hal yang harus diingat ketika menggunakan pemanggil constuktor super:

1. Pemanggil super() HARUS DIJADIKAN PERNYATAAN PERTAMA DALAM constructor.
2. Pemanggil super() hanya dapat digunakan dalam definisi constructor.
3. Termasuk constructor this() dan pemanggil super() TIDAK BOLEH TERJADI DALAM constructor YANG SAMA.

Contoh:
```java
public class Siswa {
private int nilai;
public setNilai(int nilai) {
this.nilai=nilai;
}
}
```

# PRAKTIKUM

Pada percobaan ke 3 timbul pesan kesalahan karena pada class [A_](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul6/Percobaan/A_.java) itu kurang perintah "Protected", dan ketika ditambahkan perintah tersebut maka proses berjalan dengan baik.

Dan pada percobaan ke 4 terjadi error pada class [Child](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul6/Percobaan/child.java), karena untuk pemanggilan konstruktor [Parent](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul6/Percobaan/parent.java) memerlukan panggilan pada baris pertama pada konstruktor subclass

# KESIMPULAN

  Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya.

Contoh: 
```java 
public class B extends A { ... } 
```
  Contoh diatas memberitahukan kompiler Java bahwa kita ingin mengextend class A ke class B. Dengan kata lain, class B adalah subclass (class turunan) dari class A, sedangkan class A adalah parent class dari class B. Java hanya memperkenankan adanya single inheritance.

Sejauh mana suatu member dapat diwariskan ke class lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan dengan access control (kontrol pengaksesan).

