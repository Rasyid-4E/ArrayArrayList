package tugas;

public class MainTugas {

    public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

       // Menambah 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Rasyid", "2410010032", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Jawir", "2410010052", 70));
        kelas.tambahMahasiswa(new Mahasiswa("Elizabeth", "2410010043", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Princess", "2410010025", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Jule", "2410010065", 45));

        // Array mata kuliah (ukuran tetap)
        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        kelas.tampilkanSemua();

        System.out.println("\nRata-rata Nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah Mahasiswa Lulus : "
                + kelas.jumlahLulus());

        // Menambah 1 mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "2400600421", 80));

        System.out.println("\nSetelah Menambah Mahasiswa Baru");

        System.out.println("Jumlah Data Mahasiswa Terbaru : "
                + kelas.jumlahMahasiswa());
    }
}