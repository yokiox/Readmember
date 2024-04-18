import java.util.ArrayList;
import java.util.List;

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

    public List<Notitie> getNotities() {
        return notities;
    }

    public List<Beoordeling> getBeoordelingen() {
        return beoordelingen;
    }

    public List<Geschiedenis> getGeschiedenis() {
        return geschiedenis;
    }

    public void toonGebruikersinformatie() {
        System.out.println("Notities:");
        for (Notitie notitie : notities) {
            System.out.println(notitie.getTekst() + " - " + notitie.getDatum());
        }

        System.out.println("Beoordelingen:");
        for (Beoordeling beoordeling : beoordelingen) {
            System.out.println("Score: " + beoordeling.getScore() + ", Opmerking: " + beoordeling.getOpmerking() + ", Datum: " + beoordeling.getDatum());
        }

        System.out.println("Geschiedenis:");
        for (Geschiedenis item : geschiedenis) {
            System.out.println("BeginDatum: " + item.getBeginDatum() + ", EindDatum: " + item.getEindDatum() + ", TijdperMaand: " + item.getTijdperMaand() + ", Maand: " + item.getMaand() + ", GemiddeldeTijd: " + item.getGemiddeldeTijd());
        }
    }
}