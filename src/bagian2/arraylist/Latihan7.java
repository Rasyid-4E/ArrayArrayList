package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan7 {
    public static void main(String[] args) {
        // Latihan 2: ArrayList<Integer> 5 angka, cari nilai terbesar
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(42);
        angka.add(87);
        angka.add(15);
        angka.add(63);
        angka.add(99);

        System.out.println("Data angka     : " + angka);

        // Telusuri seluruh elemen untuk cari terbesar
        int terbesar = angka.get(0);
        for (int n : angka) {
            if (n > terbesar) {
                terbesar = n;
            }
        }

        System.out.println("Nilai terbesar : " + terbesar);
    }
}