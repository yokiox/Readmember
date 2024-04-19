import java.time.LocalDate;
import java.util.*;

public class Overzicht {

    LocalDate beginDatum;
    LocalDate eindDatum;
    int snelheid;
    int aantalBladzijdes;
    private List<Boeken> gelezenBoeken;
    private List<Boeken> nogTeLezenBoeken;

    public Overzicht(LocalDate beginDatum, LocalDate eindDatum, int snelheid, int aantalBladzijdes,
                     List<Boeken> gelezenBoeken, List<Boeken> nogTeLezenBoeken) {
        this.beginDatum = beginDatum;
        this.eindDatum = eindDatum;
        this.snelheid = snelheid;
        this.aantalBladzijdes = aantalBladzijdes;
        this.gelezenBoeken = gelezenBoeken;
        this.nogTeLezenBoeken = nogTeLezenBoeken;
    }

    public void toonOverzicht() {
        System.out.println("Begin datum: " + beginDatum);
        System.out.println("Eind datum: " + eindDatum);
        System.out.println("Snelheid: " + snelheid);
        System.out.println("Aantal bladzijdes: " + aantalBladzijdes);
        System.out.println("Gelezen boeken: " + gelezenBoeken);
        System.out.println("Nog te lezen boeken: " + nogTeLezenBoeken);
    }


    public LocalDate getBeginDatum() {

        return beginDatum;
    }

    public void setBeginDatum(LocalDate beginDatum) {

        this.beginDatum = beginDatum;
    }

    public LocalDate getEindDatum() {

        return eindDatum;
    }

    public void setEindDatum(LocalDate eindDatum) {

        this.eindDatum = eindDatum;
    }

    public int getSnelheid() {

        return snelheid;
    }

    public void setSnelheid(int snelheid) {

        this.snelheid = snelheid;
    }

    public int getAantalBladzijdes() {

        return aantalBladzijdes;
    }

    public void setAantalBladzijdes(int aantalBladzijdes) {

        this.aantalBladzijdes = aantalBladzijdes;
    }

    public List<Boeken> getGelezenBoeken() {

        return gelezenBoeken;
    }

    public void voegGelezenBoekToe(Boeken boek) {
        gelezenBoeken.add(boek);
    }

    public List<Boeken> getNogTeLezenBoeken() {

        return nogTeLezenBoeken;
    }

    public void voegNogTeLezenBoekToe(Boeken boek) {
        nogTeLezenBoeken.add(boek);
    }

}
