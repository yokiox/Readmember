import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Notitie {
    private String tekst;
    private LocalDate datum;

    public Notitie(String tekst, LocalDate datum) {
        this.tekst = tekst;
        this.datum = datum;
    }

    public Notitie() {

    }

    public String getTekst() {
        return tekst;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void voegNotitieToe(Scanner scanner) {

        Gebruikersinformatie gebruikersinformatie = new Gebruikersinformatie();
        System.out.println("Voer uw notitie in:");
        scanner.nextLine();
        String tekst = scanner.nextLine();
        LocalDate datum = LocalDate.now();
        Notitie notitie = new Notitie(tekst, datum);

        gebruikersinformatie.voegNotitieToe(notitie);

        PrintWriter writer = null;

        try {
        writer = new PrintWriter(new FileWriter("Notities.csv", true));
            writer.println(tekst + "," + datum);
            System.out.println("Notitie succesvol toegevoegd.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }

    }
}



