package bagian2.arraylist;
import java.util.ArrayList;

public class Latihan3 {
 public static void main(String[]args) {
   //Membuat ArrayList kosong yang menampung Sring
   ArrayList <String> mahasiswa = new ArrayList<>();
   
   //add() menambah elemen diakhir
   mahasiswa.add("Andi");
   mahasiswa.add("Dwi");
   mahasiswa.add("Jawir");
   
   System.out.println("Isi list : " + mahasiswa);
   System.out.println("Jumlah : " + mahasiswa.size());
   System.out.println("Index 1 : " + mahasiswa.get(1));
  }    
}
