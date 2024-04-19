import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;

public class Boeken {
    private String auteur;
    private String titel;
    private String genre;
    private Gebruikersinformatie gebruikersinformatie;
    private Scanner scanner;

    public Boeken(String auteur, String titel, String genre, Gebruikersinformatie gebruikersinformatie) {
        this.auteur = auteur;
        this.titel = titel;
        this.genre = genre;
        this.gebruikersinformatie = gebruikersinformatie;
        this.scanner = new Scanner(System.in);
    }

    public Boeken() {

    }

    public void toonBoekInformatie() {

        auteur = "testAuteur";
        titel = "testTitel";
        genre = "testGenre";


        System.out.println("De naam van de auteur: " + auteur);
        System.out.println("De titel van het boek: " + titel);
        System.out.println("De genre van het boek: " + genre);
    }


    public void voegNieuwBoekToe(Scanner scanner) {
        System.out.println("Voeg een nieuw boek toe...");
        scanner.nextLine();
        System.out.println("Voeg de titel toe");
        String title = scanner.nextLine();
        System.out.println("Voeg auteur toe");
        String author = scanner.nextLine();
        System.out.println("Voeg genre toe");
        String genre = scanner.nextLine();

        String book = "Titel: " + title + ", Auteur: " + author + ", Genre: " + genre;

        System.out.println("Dit is uw boek: ");
        System.out.println();
        System.out.println(book);
        System.out.println();

        System.out.println("Boek succesvol toegevoegd.");

        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new FileWriter("Boeken.csv", true));
            writer.println(titel + "," + auteur + "," + genre);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}