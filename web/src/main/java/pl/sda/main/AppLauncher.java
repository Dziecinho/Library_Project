package pl.sda.main;

import pl.sda.BookService;
import pl.sda.models.Book;
import pl.sda.models.Genres;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Witaj w bibliotece. Co chcesz zrobić?");
        System.out.println("1: Dodaj książkę");
        System.out.println("2: Usuń książkę");
        System.out.println("3: Edytuj książkę");
        System.out.println("4: Wyświetl książki dostępne do wypożyczenia");
        System.out.println("5: Wypożycz książkę");
        System.out.println("6: Zwróć książkę");
        System.out.println("7: Dodaj autora");
        System.out.println("8: Dodaj wypożyczającego");


        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                BookService.addBook();
                break;
            case 2:
                BookService
        }
    }

    public static void addBook(Book book) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tytuł: ");
        book.setTitle(scanner.nextLine());

        System.out.println("Podaj rok wydania: ");
        book.setYearOfRelease(scanner.nextInt());

        System.out.println("Podaj numer ISBN: ");
        book.setIsbn(scanner.nextLine());

        System.out.println("Podaj gatunek: " + Arrays.toString(Genres.values()));
        String genre = scanner.nextLine();
        Genres genreEnum = Genres.valueOf(genre);
        book.setGenre(genreEnum);

        System.out.println("Podaj ilość stron: ");
        book.setPages(scanner.nextInt());

        System.out.println("Podaj krótki opis: ");
        book.setShortDesc(scanner.nextLine());

        // ustawianie nowego ID książki (+1)
        // pobieranie listy autorów do podpisania pod książkę


    }
}
