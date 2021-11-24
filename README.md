# 20104018_Arisandi-Fanansyah_Pemrograman-2

# Modul 6 : OVERLOADING DAN OVERRIDING

# Dasar Teori

  Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value). Tujuan dibuatnya overloading yaitu memudahkan pengguna method dengan fungsi yang hampir sama. Contoh :

```java
public void print( String temp ){
System.out.println("Name:" + name);
System.out.println("Address:" +
address); System.out.println("Age:" +
age);
}
public void print(double eGrade, double mGrade, double
sGrade) System.out.println("Name:" + name);
System.out.println("Math Grade:" + mGrade);
System.out.println("English Grade:" + eGrade);
System.out.println("Science Grade:" + sGrade);
}
```

  Overloading ini dapat terjadi pada class yang sama atau pada suatu parent class dan subclass-nya. Overloading mempunyai ciri-ciri sebagai berikut :

a. Nama Method harus sama.

b. Daftar parameter harus berbeda.

c. Return type boleh sama, juga boleh berbeda.

Overriding tidak sama dengan overloading, Overriding merupakan mekanisme dimana sebuah metode dapat dideklarasikan ulang pada kelas turunannya. Overriding mempunyai ciri-ciri sebagai berikut :

a. Nama Method harus sama.

b. Daftar parameter harus sama.

c. Return type harus sama.

  Berikut ini contoh terjadinya overriding dimana method RupiahVsDolar() pada class Sekarang meg-override method RupiahVsDolar() pada class Dulu.

```java
class Dulu {
public String RupiahVsDolar() {
System.out.println(“Rp 10.000”);
}
}
class Sekarang extends Dulu {
public String RupiahVsDolar() {
System.out.println(“Rp 14.000”);
}
}
```

Method yang terkena override (overiden method) diharuskan tidak boleh mempunyai modifier yang lebih luas aksesnya dari method yang mengoveride (overriding method).

# PRAKTIKUM

[Penguin](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul7/Percobaan/Penguin.java)

[Overriding](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul7/Percobaan/Overriding.java)

[Main](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul7/Percobaan/Main.java)

[Overload](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul7/Percobaan/Overload.java)

[Mahasiswa](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul7/Percobaan/Mahasiswa.java)

[Burung](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul7/Percobaan/Burung.java)

# KESIMPULAN

  Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value).

a. Nama Method harus sama. 

b. Daftar parameter harus sama. 

c. Return type harus sama. 

  Berikut ini contoh terjadinya overriding dimana method RupiahVsDolar() pada class Sekarang meg-override method RupiahVsDolar() pada class Dulu.

