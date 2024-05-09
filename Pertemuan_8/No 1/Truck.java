public class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String brand, int year, double rentalPrice, int cargoCapacity) {
        setBrand(brand);
        setYear(year);
        setPrice(rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }

    public double diskon() {
        double discount = 0.0;
        if (getYear() < 2010 && cargoCapacity > 2000) {
            discount = getPrice() * 0.2;
        } else if (getYear() < 2010) {
            discount = getPrice() * 0.1;
        }
        return discount;
    }

    public void displayInfo() {
        System.out.println("Detail Truck : ");
        System.out.println("Merk: " + getBrand());
        System.out.println("Tahun: " + getYear());
        System.out.println("Harga Sewa : " + getPrice());
        System.out.println("Kapasitas Kargo: " + cargoCapacity);
        double hargaDiskon = getPrice() - diskon();
        System.out.println("Total diskon : " + diskon());
        System.out.println("Harga Sewa Setelah Diskon : " + hargaDiskon);
        System.out.println("-------------------------------------------------");
    }

}
