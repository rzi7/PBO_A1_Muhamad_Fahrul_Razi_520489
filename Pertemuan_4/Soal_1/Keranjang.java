import java.util.ArrayList;

public class Keranjang {
    ArrayList<Barang> krjg;

    Keranjang() {
        krjg = new ArrayList<Barang>();
    }

    int totalBarang = 0;
    int totalHaraga = 0;
    void tambahBarang(Barang arg) {
        totalBarang += arg.jumlahBarang;
        if (totalBarang <= 5) {
            krjg.add(arg);
            totalHaraga += (arg.hargaBarang*arg.jumlahBarang);
            System.out.println("Berhasil memasukkan ke kranjang");
        } else {
            totalBarang -= arg.jumlahBarang;
            System.out.println("Wes too, Keranjange wes mbludhag!!!");
        }
    }



    void printHasil() {
        System.out.println("Jumlah Barang Di Keranjang Saat Ini : " + totalBarang);
        System.out.println("Barang Pada Keranjang:");
        for (Barang barang : this.krjg) {
            System.out.println("# " + barang.namaBarang + ", " + "jumlah : " + barang.jumlahBarang);
        }

        System.out.println("Total Harga Yang Harus di Bayar : " + totalHaraga);
    }
}

