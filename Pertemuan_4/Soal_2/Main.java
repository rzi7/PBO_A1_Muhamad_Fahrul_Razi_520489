import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieApp movieApp = new MovieApp();
        Scanner scan = new Scanner(System.in);

        Film avenger = new Film("Avenger: endgame", "Action", 180, 50);
        Film joker = new Film("Joker", "Drama", 122, 60);

        movieApp.addFilm(avenger);
        movieApp.addFilm(joker);

        movieApp.displayAllFilms();

        System.out.println();

        movieApp.searchFilm("Joker");
        movieApp.searchFilm("Danun");

        System.out.println();

        movieApp.bookFilm(avenger, 2);
        movieApp.bookFilm(joker, 10);

        System.out.print("Masukkan id pesanan yang ingin dicari: ");
        int id = scan.nextInt();
        movieApp.searchBooking(id);

        scan.close();
    }

}

