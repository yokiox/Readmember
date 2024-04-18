import java.time.LocalDate;
import java.util.Scanner;

public class Beoordeling extends Gebruikersinformatie {

    private int score;
    private String opmerking;
    private LocalDate datum;

    public Beoordeling(int score, String opmerking, LocalDate datum) {
        this.score = score;
        this.opmerking = opmerking;
        this.datum = datum;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setOpmerking(String opmerking) {
        this.opmerking = opmerking;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public int getScore() {
        return score;
    }

    public String getOpmerking() {
        return opmerking;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void voegBeoordelingToe() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer uw score in (1-10): ");
        int score = scanner.nextInt();
        if (score < 1 || score > 10) {
            System.out.println("Ongeldige score. De score moet tussen 1 en 10 liggen.");
            return;
        }
        scanner.nextLine();

        System.out.println("Voer uw opmerking in:");
        String opmerking = scanner.nextLine();
        LocalDate datum = LocalDate.now();

        this.score = score;
        this.opmerking = opmerking;
        this.datum = datum;

        System.out.println("Beoordeling toegevoegd: Score - " + score + ", Opmerking - " + opmerking);
    }
}