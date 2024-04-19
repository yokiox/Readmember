import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gebruikersinformatie {
    private List<Notitie> notities;
    private List<Beoordeling> beoordelingen;
    private List<Geschiedenis> geschiedenis;

    public Gebruikersinformatie() {
        this.notities = new ArrayList<>();
        this.beoordelingen = new ArrayList<>();
        this.geschiedenis = new ArrayList<>();
    }

    public void voegNotitieToe(Notitie notitie) {
        notities.add(notitie);
    }

    public void voegBeoordelingToe(Beoordeling beoordeling) {
        beoordelingen.add(beoordeling);
    }

    public void voegGeschiedenisToe(Geschiedenis geschiedenisItem) {
        geschiedenis.add(geschiedenisItem);
    }

    public void toonGebruikersinformatie() {
        System.out.println("Welke informatie wilt u bekijken?");
        System.out.println("1. Notities");
        System.out.println("2. Beoordelingen");
        System.out.println("3. Geschiedenis");

        Scanner scanner = new Scanner(System.in);
        int keuze = scanner.nextInt();
        switch (keuze) {
            case 1:
                toonNotities();
                break;
            case 2:
                toonBeoordelingen();
                break;
            case 3:

                toonGeschiedenis();

                break;
            default:
                System.out.println("Ongeldige keuze.");
        }
    }

    private void toonNotities() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Notities.csv"))) {
            String line;
            System.out.println("Notities:");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Tekst: " + parts[0] + ", Datum: " + parts[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void toonBeoordelingen() {
        System.out.println("Beoordelingen:");

        try (BufferedReader reader = new BufferedReader(new FileReader("Beoordelingen.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int score = Integer.parseInt(parts[0]);
                String opmerking = parts[1];
                LocalDate datum = LocalDate.parse(parts[2]); // Assuming the date is stored in ISO-8601 format (yyyy-MM-dd)
                System.out.println("Score: " + score + ", Opmerking: " + opmerking + ", Datum: " + datum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void toonGeschiedenis() {
        System.out.println("Geschiedenis:");

        try (BufferedReader reader = new BufferedReader(new FileReader("Geschiedenis.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String activity = parts[0];
                LocalDate date = LocalDate.parse(parts[1]); // Assuming the date is stored in ISO-8601 format (yyyy-MM-dd)
                LocalTime time = LocalTime.parse(parts[2]); // Assuming the time is stored in ISO-8601 format (HH:mm:ss)
                System.out.println("Activiteit: " + activity + ", Datum: " + date + ", Tijd: " + time);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
