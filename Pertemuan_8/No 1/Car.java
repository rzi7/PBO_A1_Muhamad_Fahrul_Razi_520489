public class Car extends Vehicle {
    enum CarType {
        CITY_CAR,
        FAMILY_CAR,
        PREMIUM_CAR
    }

    private CarType carType;

    public Car(String brand, int year, double rentalPrice, CarType carType) {
        setBrand(brand);
        setYear(year);
        setPrice(rentalPrice);
        this.carType = carType;
    }

    public double diskon() {
        double diskon = 0.0;
        if (carType == CarType.PREMIUM_CAR) {
            diskon = getPrice() * 0.1;
        } else if (carType == CarType.FAMILY_CAR) {
            diskon = getPrice() * 0.05;
        }
        return diskon;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void displayInfo() {
        System.out.println("Detail Mobil : ");
        System.out.println("Merk: " + getBrand());
        System.out.println("Tahun: " + getYear());
        System.out.println("Harga Sewa : " + getPrice());
        System.out.println("Tipe: " + carType);
        double hargaDiskon = getPrice() - diskon();
        System.out.println("Total diskon : " + diskon());
        System.out.println("Harga Sewa Setelah Diskon: " + hargaDiskon);
        System.out.println("-------------------------------------------------");
    }

}
