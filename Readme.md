# 20104018_Arisandi-Fanansyah_Pemrograman-2

# Modul 8 : POLIMORFISME

# Dasar Teori

  Polymorphism (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui subclass. Misalnya deklarasi pernyataan berikut ini:

  Dimana Manager() adalah kontruktor pada class Manager yang merupakan

```java
Employee employee = new Manager();
//<nama class> <variable bebas> = new <kontruktor>();
```
Subclass dari class Employee.

  Virtual Method Invocation (VMI) bisa terjadi jika terjadi polimorfisme dan overriding. Pada saat obyek yang sudah dibuat tersebut memanggil overridden method pada parent class, kompiler Java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass, dimana yang seharusnya dipanggil adalah overridden method. Berikut contoh terjadinya VMI:

```java
class Parent {
int x = 5;
public void Info() {
System.out.println(“Ini class Parent”);
}
}
class Child extends Parent {
int x = 10;
public void Info() {
System.out.println(“Ini class Child”);
}
}
public class Tes {
public static void main(String args[]) {
Parent tes=new Child();
System.out.println(“Nilai x = “ + tes.x);
tes.Info();
}
}
```

  Hasil dari running program diatas adalah sebagai berikut:

```
Nilai x = 5
Ini class Child
```

  Polymorphic arguments adalah tipe suatu parameter yang menerima suatu nilai yang bertipe subclass-nya. Berikut contoh dari polymorphics arguments:

```java
class Pegawai {
...
}
class Manajer extends Pegawai {
...
}
public class Tes {
public static void Proses(Pegawai peg) {
...
}
public static void main(String args[]) { Manajer man = new
Manajer(); Proses(man);
}
}
```

  Pernyataan instanceof sangat berguna untuk mengetahui tipe asal dari suatu polymorphic arguments. Untuk lebih jelasnya, misalnya dari contoh program sebelumnya, kita sedikit membuat modifikasi pada class Tes dan ditambah sebuah class baru Kurir, seperti yang tampak dibawah ini:

```java
...
class Kurir extends Pegawai {
...
}
public class Tes {
public static void Proses(Pegawai peg) {
if (peg instanceof Manajer) {
...lakukan tugas-tugas manajer...
} else if (peg instanceof Kurir) {
...lakukan tugas-tugas kurir...
} else {
...lakukan tugas-tugas lainnya...
}
}
public static void main(String args[]) { Manajer man = new
Manajer();
Kurir kur = new Kurir(); Proses(man);
Proses(kur);
}
}
```

  Seringkali pemakaian instanceof diikuti dengan casting object dari tipe parameter ke tipe asal. Misalkan saja program kita sebelumnya. Pada saat kita sudah melakukan instanceof dari tipe Manajer, kita dapat melakukan casting object ke tipe asalnya, yaitu Manajer. Caranya adalah seperti berikut:

```java
...
if (peg instanceof Manajer) { Manajer man = (Manajer) peg;
...lakukan tugas-tugas manajer...
}
```
  
# PRAKTIKUM

Mengapa pada class [Pegawai](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul8/Percobaan/Pegawai.java), [Gaji](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul8/Percobaan/Gaji.java), dan [Virtual_Demo](https://github.com/Arisandi-Fanansyah/20104018_Arisandi-Fanansyah_Pemrograman-2/blob/Modul8/Percobaan/VirtualDemo.java) hasil akhir pada saat proses running seperti dibawah ini?

```
Menyusun Pegawai
Memanggil mailCheck Berdasarkan Referensi Gaji --
Memeriksa kelas gaji dalam surat
Surat tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailCheck Berdasarkan Referensi Pegawai--
Memeriksa kelas gaji dalam surat
Surat tertuju untuk Ini nama dengan gaji 2500.0
```

### Jawaban

Hasil analisis yang saya dapat adalah walaupun semua isi method sama, namun pada akhirnya implementasi didunia nyata itu berbeda-beda.

# KESIMPULAN

Polymorphism (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui subclass. Virtual Method Invocation (VMI) bisa terjadi jika terjadi polimorfisme dan overriding. Pada saat obyek yang sudah dibuat tersebut memanggil overridden method pada parent class, kompiler Java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass, dimana yang seharusnya dipanggil adalah overridden method.
  Polymorphic arguments adalah tipe suatu parameter yang menerima suatu nilai yang bertipe subclass-nya. Pernyataan instanceof sangat berguna untuk mengetahui tipe asal dari suatu polymorphic arguments. Seringkali pemakaian instanceof diikuti dengan casting object dari tipe parameter ke tipe asal. Misalkan saja program kita sebelumnya. Pada saat kita sudah melakukan instanceof dari tipe Manajer, kita dapat melakukan casting object ke tipe asalnya, yaitu Manajer.
