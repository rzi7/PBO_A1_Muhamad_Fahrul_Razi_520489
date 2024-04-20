import java.util.HashMap;

public class Gudang {
    HashMap<Toko.tipeBarang, Integer> isiGudang; 
    HashMap<Bahan, Integer> stokBahan; 
    public enum Bahan {
        BAUT,
        KAYU,
        CAT
    }

    public Gudang() {
        this.isiGudang = new HashMap<>();
        this.stokBahan = new HashMap<>();
        isiGudang.put(Toko.tipeBarang.KURSI, 0);
        isiGudang.put(Toko.tipeBarang.MEJA, 0);
        isiGudang.put(Toko.tipeBarang.LEMARI, 0);
        stokBahan.put(Bahan.BAUT, 0);
        stokBahan.put(Bahan.KAYU, 0);
        stokBahan.put(Bahan.CAT, 0);
    }

    public void cekStokBahan() {
        System.out.println("STOK BAHAN : ");
        for (Bahan bahan : stokBahan.keySet()) {
            System.out.println("jumlah : " + bahan + ", saat ini adalah : " + stokBahan.get(bahan) + " buah");
        }
    }

    public void cekIsiGudang() {
        System.out.println("ISI GUDANG : ");
        for (Toko.tipeBarang bahan : isiGudang.keySet()) {
            System.out.println("jumlah : " + bahan + ", saat ini adalah : " + isiGudang.get(bahan) + " buah");
        }
    }

    public void tambahBahan(Bahan bahan, int jumlahBaru) {
        int jumlahLama = stokBahan.getOrDefault(bahan, 0);
        stokBahan.put(bahan, jumlahLama + jumlahBaru);
        System.out.println(bahan + " sebanyak " + jumlahBaru + " buah telah berhasil ditambahkan");
    }

    public void kurangiBahan(Bahan bahan, int jumlah) {
        stokBahan.put(bahan, stokBahan.get(bahan) - jumlah);
    }

    public void buatBarang(Toko.tipeBarang barang, int jumlah) {
        if (!bahanPembuatanMencukupi(barang, jumlah)) {
            System.out.println("Bahan tidak cukup");
            return;
        } else if (slotTersedia(barang, jumlah)) {
            if (barang == Toko.tipeBarang.MEJA) {
                kurangiBahan(Bahan.CAT, 2 * jumlah);
                kurangiBahan(Bahan.BAUT, 20 * jumlah);
                kurangiBahan(Bahan.KAYU, 3 * jumlah);
            } else if (barang == Toko.tipeBarang.KURSI) {
                kurangiBahan(Bahan.CAT, 1 * jumlah);
                kurangiBahan(Bahan.BAUT, 10 * jumlah);
                kurangiBahan(Bahan.KAYU, 2 * jumlah);
            } else if (barang == Toko.tipeBarang.LEMARI) {
                kurangiBahan(Bahan.CAT, 3 * jumlah);
                kurangiBahan(Bahan.BAUT, 30 * jumlah);
                kurangiBahan(Bahan.KAYU, 5 * jumlah);
            }
            masukkanBarangKeGudang(barang, jumlah);
            System.out.println(jumlah + " " + barang + " berhasil di tambahkan ke gudang");
        } else {
            System.out.println("Gudang Penuh");
        }
    }

    public boolean slotTersedia(Toko.tipeBarang barang, int jumlah) {
        boolean isAlready = false;
        switch (barang) {
            case KURSI:
                if (isiGudang.get(barang) + jumlah <= 20) {
                    isAlready = true;
                }
                break;
            case MEJA:
                if (isiGudang.get(barang) + jumlah <= 10) {
                    isAlready = true;
                }
                break;
            case LEMARI:
                if (isiGudang.get(barang) + jumlah <= 5) {
                    isAlready = true;
                }
                break;
        }
        return isAlready;
    }

    public void masukkanBarangKeGudang(Toko.tipeBarang barang, int jumlah) {
        int jumlahLama = isiGudang.getOrDefault(barang, 0);
        isiGudang.put(barang, jumlahLama + jumlah);
    }

    public void keluarkanBarangDariGudang(Toko.tipeBarang barang, int jumlah) {
        isiGudang.put(barang, isiGudang.get(barang) - jumlah);
    }

    public boolean bahanPembuatanMencukupi(Toko.tipeBarang barang, int jumlah) {
        boolean isAlready = false;
        switch (barang) {
            case KURSI:
                if (stokBahan.get(Bahan.CAT) >= 1*jumlah && stokBahan.get(Bahan.BAUT) >= 10*jumlah && stokBahan.get(Bahan.KAYU) >= 2*jumlah) {
                    isAlready = true;
                }
                break;
            case MEJA:
                if (stokBahan.get(Bahan.CAT) >= 2*jumlah && stokBahan.get(Bahan.BAUT) >= 20*jumlah && stokBahan.get(Bahan.KAYU) >= 3*jumlah) {
                    isAlready = true;
                }
                break;
            case LEMARI:
                if (stokBahan.get(Bahan.CAT) >= 3*jumlah && stokBahan.get(Bahan.BAUT) >= 30*jumlah && stokBahan.get(Bahan.KAYU) >= 5*jumlah) {
                    isAlready = true;
                }
                break;
        }
        return isAlready;
    }
}