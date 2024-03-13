import java.util.ArrayList;
import java.util.Random;

public class MovieApp {
    ArrayList<Film> listFilm;
    ArrayList<Integer> listId;
    Random random = new Random();

    MovieApp() {
        listFilm = new ArrayList<Film>();
        listId = new ArrayList<Integer>();
    }

    void addFilm(Film arg) {
        listFilm.add(arg);
    }

    void displayAllFilms() {
        for (Film film : this.listFilm) {
            System.out.println(film.title + " - " + film.genre + " - " + film.duration + " mins - Available Seats: "
                    + film.availableSeats);
        }
    }

    void searchFilm(String title) {
        boolean availableFilm = false;
        for (Film film : this.listFilm) {
            if (film.title.equals(title)) {
                availableFilm = true;
            }
        }
        if (availableFilm) {
            System.out.println("Film Tersedia");
        } else {
            System.out.println("Film Tidak Tersedia");
        }
    }

    void bookFilm(Film arg, int numberOfTickets) {
        if (numberOfTickets < arg.availableSeats ) {
            System.out.println("Pesanan berhasil dengan detail pesanan:");
            System.out.println("Film: " + arg.title);
            System.out.println("Jumlah Tiket: " + numberOfTickets);
            int id = random.nextInt(1000);
            for (int i : this.listId) {
                while (id == i) {
                    id = random.nextInt(1000);
                }
            }
            System.out.println("Booking ID: " + id);
            arg.id = id;
            arg.ticket = numberOfTickets;
            listId.add(id);
            arg.availableSeats -= numberOfTickets;
        } else {
            System.out.println("Pesanan tidak dapat diproses. Kursi tidak tersedia.");
            this.displayAllFilms();
        }
        System.out.println();
    }

    void searchBooking(int bookid) {
        boolean availableID = false;
        for (int i : this.listId) {
            if (i == bookid) {
                availableID = true;
            }
        }
        if (availableID) {
            for (Film film : this.listFilm) {
                if (film.id == bookid) {
                    System.out.println("Pesanan Ditemukan: ");
                    System.out.println("Film: " + film.title);
                    System.out.println("Jumlah Tiket Yang Dipesan: " + film.ticket);
                }

            }

        } else {
            System.out.println("Pesanan Tidak Ditemukan");
        }
    }
}
