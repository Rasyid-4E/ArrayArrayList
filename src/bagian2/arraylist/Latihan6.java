package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan6 {
    public static void main(String[] args) {
        // Latihan 1: ArrayList<String> daftar belanja
        ArrayList<String> belanja = new ArrayList<>();

        // Tambah 4 item
        belanja.add("Nasi");
        belanja.add("Ayam");
        belanja.add("Tempe");
        belanja.add("Sayur");

        System.out.println("Sebelum dihapus : " + belanja);

        // Hapus item ke-2 (index 1)
        belanja.remove(1);

        System.out.println("Setelah dihapus : " + belanja);
        System.out.println("Jumlah akhir    : " + belanja.size());
    }
}