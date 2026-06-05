package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // [LATIHAN 2] Constructor Buku sekarang memerlukan tahunTerbit
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1980));
        perpus.tampilkanKoleksi();

        System.out.println();
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali

        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());

        // [LATIHAN 1] Uji kembalikanBuku
        System.out.println();
        perpus.kembalikanBuku("Bumi Manusia");          // berhasil dikembalikan
        perpus.kembalikanBuku("Bumi Manusia");          // tidak sedang dipinjam
        perpus.kembalikanBuku("Harry Potter");          // tidak ditemukan

        System.out.println();
        perpus.tampilkanKoleksi();

        // [LATIHAN 3] Uji cariPenulis
        System.out.println();
        perpus.cariPenulis("Pramoedya");
        System.out.println();
        perpus.cariPenulis("J.K. Rowling"); // tidak ada
    }
}