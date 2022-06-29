package transaksi;

public class superclass {
    public static void main(String[] args) {
    

        subclass objek = new subclass();
        objek.transaksi();

        if (objek.totalMobil > 50000){
            System.out.println("\n|---------Transaksi Anda Melebihi Rp. 50.000--------|");
            System.out.println("|------------Anda Mendapat Cashback 10%-------------|\n");
            System.out.println("Pembayaran\t\t\t: Rp. " + objek.totalMobil);
            System.out.println("Uang Anda\t\t\t: Rp. " + objek.bayar);
            System.out.println("Cashback Anda\t\t: Rp " + objek.diskon);
            System.out.println("Kembalian Anda\t\t: Rp. " + (objek.kembalian + objek.diskon));
            System.out.println("--------------------Terimakasih--------------------");
        }else if (objek.totalMotor > 25000){
            System.out.println("\n|---------Transaksi Anda Melebihi Rp. 25.000--------|");
            System.out.println("|----------------Anda Mendapat Cashback 5%------------|\n");
            System.out.println("Pembayaran\t\t\t: Rp. " + objek.totalMotor);
            System.out.println("Uang Anda\t\t\t: Rp. " + objek.bayar);
            System.out.println("Cashback Anda\t\t: Rp " + objek.diskon);
            System.out.println("Kembalian Anda\t\t: Rp. " + (objek.kembalian + objek.diskon));
            System.out.println("--------------------Terimakasih--------------------");
        } else System.out.println("Kembalian Anda\t\t: Rp. " + objek.kembalian);
    }
}
