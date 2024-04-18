import java.time.LocalDate;

public class Notitie {
    private String tekst;
    private LocalDate datum;

    public Notitie(String tekst, LocalDate datum) {
        this.tekst = tekst;
        this.datum = datum;
    }

    public String getTekst() {
        return tekst;
    }

    public LocalDate getDatum() {
        return datum;
    }
}