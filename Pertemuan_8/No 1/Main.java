
public class Main {
    public static void main(String[] args) {

        Car innova = new Car("Innova Reborn", 2015, 500.0, Car.CarType.PREMIUM_CAR);
        Car avanza = new Car("Avanza", 2009, 300.0, Car.CarType.FAMILY_CAR);
        Car brio = new Car("Hond Brio", 2012, 300.0, Car.CarType.CITY_CAR);

        Truck isuzuTruck = new Truck("Isuzu", 2013, 500.0, 1500);
        Truck volvoTruck = new Truck("Volvo", 2013, 650.0, 2500);
        Truck mistsubisi = new Truck("Mitsubisi", 2010, 850.0, 4000);

        innova.displayInfo();
        avanza.displayInfo();
        brio.displayInfo();

        isuzuTruck.displayInfo();
        volvoTruck.displayInfo();
        mistsubisi.displayInfo();
    }
}