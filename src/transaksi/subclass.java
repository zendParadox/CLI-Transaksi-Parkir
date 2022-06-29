package transaksi;
import java.util.Scanner;

public class subclass extends superclass {
    String pesan;
    double jam, bayar, kembalian, totalMobil, totalMotor, diskon, kurang;
    boolean ket;

    Scanner input = new Scanner(System.in);

    void transaksi(){
        System.out.println("------------Selamat Datang-------------");
        System.out.println("----Tempat Parkir Mall of Indonesia----");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan Pilihan Anda: ");
        pesan = input.nextLine();

        switch (pesan){
            case "Mobil":
                System.out.println("Pilihan Anda\t\t: Mobil");
                System.out.println("Harga\t\t\t: Rp. 5.000,-/jam");
                System.out.print("Berapa Jam\t\t: ");
                jam = input.nextDouble();
                totalMobil = jam * 5000;
                System.out.println("Total Pembayaran\t: Rp. " + totalMobil);
                diskon = 0.1 * totalMobil;

                do {
                    ket = false;
                    System.out.print("Masukkan pembayaran anda: ");
                    bayar = input.nextDouble();

                    if (bayar < totalMobil) {
                        ket = true;
                        kurang = totalMobil - bayar;
                        System.out.println("---------------------Peringatan!---------------------");
                        System.out.println("Mohon Maaf Uang anda Kurang: " + kurang);
                        System.out.println("-----------------------------------------------------");
                    }else {
                        ket = false;
                        kembalian = bayar - totalMobil;
                    }
                }while (ket);
                break;


            case "Motor":
                System.out.println("Pilihan Anda\t\t: Motor");
                System.out.println("Harga\t\t\t: Rp. 2.500,-/jam");
                System.out.print("Berapa Jam\t\t: ");
                jam = input.nextDouble();
                totalMotor = jam * 2500;
                System.out.print("Total Pembayaran\t: Rp. " + totalMotor);
                diskon = 0.05 * totalMotor;
                kembalian = bayar - totalMotor;

                do {
                    ket = false;
                    System.out.print("\nMasukkan pembayaran anda: ");
                    bayar = input.nextDouble();

                    if (bayar < totalMotor) {
                        ket = true;
                        kurang = totalMotor - bayar;
                        System.out.println("---------------------Peringatan!---------------------");
                        System.out.println("Mohon Maaf Uang anda Kurang: " + kurang);
                        System.out.println("-----------------------------------------------------");
                    }else {
                        ket = false;
                        kembalian = bayar - totalMotor;
                    }
                }while (ket);
                break;
            default:
                System.out.println("Mohon Maaf Anda Salah Input!");
        }
    }
}
