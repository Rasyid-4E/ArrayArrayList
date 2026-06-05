package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan8 {
    public static void main(String[] args) {
        // Latihan 3: ArrayList 6 nama, cetak yang diawali huruf A
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Agus");
        nama.add("Dian");

        System.out.println("Semua nama       : " + nama);
        System.out.println("Nama berawalan A :");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println("- " + n);
            }
        }
    }
}