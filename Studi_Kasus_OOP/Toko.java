import java.util.ArrayList;

public class Toko {
    private ArrayList<Pembeli> antrian = new ArrayList<>();
    private Gudang gudangBarang = new Gudang();
    public enum tipeBarang {
        KURSI,
        MEJA,
        LEMARI
    }

    public Gudang getGudangBarang() {
        return gudangBarang;
    }

    public void tambahAntrian(Pembeli pembeli) {
        if (antrianPenuh()) {
            System.out.println("Antrian Penuh");
        } else {
            antrian.add(pembeli);
            System.out.println("Berhasil menambah antrian");
        }
    }

    public void selesaikanAntrian() {
        Pembeli barang = antrian.get(0);
        if (barangDiBeliTersedia(barang.getBarangDiBeli(), barang.getJumlahBarang())) {
            gudangBarang.keluarkanBarangDariGudang(barang.getBarangDiBeli(), barang.getJumlahBarang());
            antrian.remove(0);
            System.out.println(barang.getJumlahBarang() + " " + barang.getBarangDiBeli() + " berhasil dikeluarkan dari gudang");
            System.out.println("antrian terdepan berhasil di selesaikan");
        } else {
            System.out.println("Barang kurang atau tidak tersedia");
        }
    }

    public void cekIsiAntrian() {
        int i = 0;
        System.out.println("LIST ANTRIAN : ");
        if (antrian.isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            for (Pembeli p : antrian) {
                System.out.println("antrian ke " + (i + 1) + ", nama :  " + p.getNama() + ", barang dibeli " + p.getBarangDiBeli() + ", jumlah barang di beli : " + p.getJumlahBarang());
                i++;
            }
        }
    }

    private boolean antrianPenuh() {
        if (antrian.size() >= 10) {
            return true;
        } else {
            return false;
        }
    }

    private boolean barangDiBeliTersedia(tipeBarang barang, int jumlah) {
        boolean isAlready = false;
        if (gudangBarang.isiGudang.get(barang) >= jumlah) {
            isAlready = true;
        }

        return isAlready;
    }
}
