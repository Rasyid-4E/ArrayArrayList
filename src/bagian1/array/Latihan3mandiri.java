package bagian1.array;

public class Latihan3mandiri {
    public static void main(String[] args) {

        // === Latihan 1: Suhu Tertinggi & Terendah ===
        System.out.println("=== Latihan 1: Suhu Harian ===");
        double[] suhu = {31.5, 28.0, 33.2, 26.8, 30.1, 29.4};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (double s : suhu) {
            if (s > tertinggi) tertinggi = s;
            if (s < terendah)  terendah = s;
        }

        System.out.println("Data suhu  : " + java.util.Arrays.toString(suhu));
        System.out.println("Tertinggi  : " + tertinggi + " C");
        System.out.println("Terendah   : " + terendah + " C");

        System.out.println();

        // === Latihan 2: Nama Hari Lebih dari 5 Huruf ===
        System.out.println("=== Latihan 2: Nama Hari > 5 Huruf ===");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        System.out.println("Semua hari : " + java.util.Arrays.toString(hari));
        System.out.println("Hari dengan lebih dari 5 huruf :");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println("- " + h + " (" + h.length() + " huruf)");
            }
        }

        System.out.println();

        // === Latihan 3: Hitung Angka Genap ===
        System.out.println("=== Latihan 3: Hitung Angka Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;
        for (int n : angka) {
            if (n % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("Data angka   : " + java.util.Arrays.toString(angka));
        System.out.println("Jumlah genap : " + jumlahGenap);
    }
}