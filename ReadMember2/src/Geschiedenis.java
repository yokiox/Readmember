import java.time.LocalDate;
import java.time.LocalTime;

public class Geschiedenis extends Gebruikersinformatie {

    private LocalDate beginDatum;
    private LocalDate eindDatum;
    private LocalTime tijdperMaand;
    private String maand;
    private float gemiddeldeTijd;

    public Geschiedenis(LocalDate beginDatum, LocalDate eindDatum, LocalTime tijdperMaand, String maand, float gemiddeldeTijd) {
        this.beginDatum = beginDatum;
        this.eindDatum = eindDatum;
        this.tijdperMaand = tijdperMaand;
        this.maand = maand;
        this.gemiddeldeTijd = gemiddeldeTijd;
    }

    public void setBeginDatum(LocalDate beginDatum) {
        this.beginDatum = beginDatum;
    }

    public void setEindDatum(LocalDate eindDatum) {
        this.eindDatum = eindDatum;
    }

    public void setTijdperMaand(LocalTime tijdperMaand) {
        this.tijdperMaand = tijdperMaand;
    }

    public void setMaand(String maand) {
        this.maand = maand;
    }

    public void setGemiddeldeTijd(float gemiddeldeTijd) {
        this.gemiddeldeTijd = gemiddeldeTijd;
    }

    public LocalDate getBeginDatum() {
        return beginDatum;
    }

    public LocalDate getEindDatum() {
        return eindDatum;
    }

    public LocalTime getTijdperMaand() {
        return tijdperMaand;
    }

    public String getMaand() {
        return maand;
    }

    public float getGemiddeldeTijd() {
        return gemiddeldeTijd;
    }
}