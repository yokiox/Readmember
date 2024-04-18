import java.util.Scanner;
import java.time.LocalDate;

public class Boeken {
    private Gebruikersinformatie gebruikersinformatie;
    private Scanner scanner;
    private String auteur;
    private String titel;
    private String genre;

    public Boeken(String auteur, String titel, String genre, Gebruikersinformatie gebruikersinformatie) {
        this.auteur = auteur;
        this.titel = titel;
        this.genre = genre;
        this.gebruikersinformatie = gebruikersinformatie;
        this.scanner = new Scanner(System.in);
    }

    public Boeken(String auteur, String titel, String genre) {
    }

    public static Boeken voegBoekToe(String auteur, String titel, String genre, Gebruikersinformatie gebruikersinformatie) {
        return new Boeken(auteur, titel, genre, gebruikersinformatie);
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitel() {
        return titel;
    }

    public String getGenre() {
        return genre;
    }

    public void toonBoeken() {
        System.out.println("De naam van de auteur: " + auteur);
        System.out.println("De titel van het boek: " + titel);
        System.out.println("De genre van het boek: " + genre);
    }

    public void keuzePanel() {
        System.out.println("Wat wil je doen met dit boek?");
        System.out.println("1. Zie Boek informatie");
        System.out.println("2. Voeg notitie toe");
        System.out.println("3. Voeg nieuw boek toe");
        System.out.println("4. Voeg beoordeling toe");

        int keuze = scanner.nextInt();
        scanner.nextLine();

        switch (keuze) {
            case 1:
                toonBoeken();
                break;
            case 2:
                voegNotitieToe();
                break;
            case 3:
                voegNieuwBoekToe();
                break;
            case 4:
                voegBeoordelingToe();
                break;
            default:
                System.out.println("Ongeldige keuze");
        }
    }

    private void voegBeoordelingToe() {
        System.out.println("Voer uw score in:");
        int score = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Voer uw opmerking in:");
        String opmerking = scanner.nextLine();
        LocalDate datum = LocalDate.now();
        Beoordeling beoordeling = new Beoordeling(score, opmerking, datum);

        gebruikersinformatie.voegBeoordelingToe(beoordeling);
    }

    private void voegNotitieToe() {
        System.out.println("Voer uw tekst in:");
        String tekst = scanner.nextLine();
        LocalDate datum = LocalDate.now();
        Notitie notitie = new Notitie(tekst, datum);

        gebruikersinformatie.voegNotitieToe(notitie);
    }

    private void voegNieuwBoekToe() {
        System.out.println("Voeg een nieuw boek toe...");

    }
}