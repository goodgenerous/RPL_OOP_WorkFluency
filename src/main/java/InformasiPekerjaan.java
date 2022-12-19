import java.util.Scanner;

public class InformasiPekerjaan {

    public static void main(String[] args) {
        int input;
        boolean check = true, checkMenu = true;
        Scanner scan = new Scanner(System.in);

        while(checkMenu == true){
            System.out.println("=====SELAMAT DATANG DI WORKFLUENCY=====");
            System.out.println("Pilih menu di bawah : ");
            System.out.println("1. Informasi Pekerjaan");
            System.out.println("2. Latihan  Wawancara");
            System.out.println("3. Cek CV");
            System.out.println("4. Profil");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan kamu : ");
            input = scan.nextInt();

            switch (input){
                case 1 :
                    while(check == true){
                        System.out.println("Bidang Pekerjaan");
                        System.out.println("1. UI/UX Designer");
                        System.out.println("2. Product Designer");
                        System.out.println("3. Web Designer");
                        System.out.println("4. iOS Developer");
                        System.out.println("5. Android Developer");
                        System.out.println("6. Game Developer");
                        System.out.println("7. Product Manager");
                        System.out.println("5. Data Scientist");
                        System.out.println("6. Back...");

                        System.out.print("Pilih bidang : ");
                        int pilih = scan.nextInt();
                        if(pilih == 1){
                            System.out.println("===DETAIL KARIR===");
                            System.out.println("UI/UX DESIGNER");
                            System.out.println("Rp5.000.000 - Rp12.000.000");
                            System.out.println();
                            System.out.println("Deskripsi");
                            System.out.println("UI Designer memiliki tugas menentukan tampilan aplikasi atau situs. /n" +
                                    "Sementara UX Designer menentukan bagaimana suatu aplikasi atau situs bisa beroperasi dengan mudah. /n" +
                                    "Namun dalam bekerja, keduanya harus berlandaskan pada hasil riset supaya /n " +
                                    "aplikasi atau situs yang dirancang benar-benar efektif.");

                            System.out.println();
                            System.out.println("Peran dan Tanggung Jawab");
                            System.out.println("1. Mengumpulkan data klien, mulai dari budget-nya berapa, bisnis yang dijalani apa, tujuannya apa, penggunanya siapa, juga kompetitornya siapa.");
                            System.out.println("2. Melakukan riset, survei, analisis, user testing dan berbagai metode pengumpulan data lainnya untuk memperoleh informasi seputar pengguna.");
                            System.out.println("3. Memvisualisasi user flow menjadi desain produk yang teruji dan indah.");

                            System.out.println();
                            System.out.println("Softskill");
                            System.out.println("Pemecahan Masalah               Komunikasi Publik");
                            System.out.println("Kritis                          Kerja sama");

                            System.out.println();
                            System.out.println("Hardskill");
                            System.out.println("Riset dan Analisis Data         Warna dan Tipografi");
                            System.out.println("Desain Grafis                   Teori UX");

                            System.out.println();
                            System.out.println("Jenjang Karir");
                            System.out.println("1. UI/UX Designer");
                            System.out.println("2. Senior UI/UX Designer");
                            System.out.println("3. Head of UI/UX Designer");

                            System.out.println();
                            System.out.println();

                        }else if(pilih == 6){
                            check = false;

                        }else{
                            System.out.println("Lorem Ipsum");
                            System.out.println();
                            System.out.println();
                        }
                    }
                    break;
                case 2 :
                    System.out.println("Latihan Wawancara");
                    System.out.println("Login Terlebih dahulu...");
                    System.out.println();
                    System.out.println();
                    break;
                case 3 :
                    System.out.println("Cek CV");
                    System.out.println("Login Terlebih dahulu...");
                    System.out.println();
                    System.out.println();
                    break;
                case 4 :
                    System.out.println("Profil");
                    System.out.println("Login >>> Klik di sini");
                    System.out.println("Daftar >>> Klik di sini");
                    System.out.println();
                    System.out.println();
                    break;
                case 5 :
                    checkMenu = false;
                    break;
            }
        }

    }
}
