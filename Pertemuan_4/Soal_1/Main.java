public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("Beras", 16000, 1);
        Barang barang2 = new Barang("Gula", 10000, 1);
        Barang barang3 = new Barang("Susu", 5000, 2);
        Barang barang4 = new Barang("Teh", 5000, 3);
        Barang barang5 = new Barang("Endog", 2000, 1);
        
        // Keranjang keranjang = new Keranjang();
        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambahBarang(barang1);
        keranjang1.tambahBarang(barang2);
        keranjang1.tambahBarang(barang3);
        keranjang1.tambahBarang(barang4);
        keranjang1.tambahBarang(barang5);

        System.out.println("\n================================\n");

        keranjang1.printHasil();
    }
}


