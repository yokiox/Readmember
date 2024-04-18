import java.time.LocalDate;
import java.util.*;

class Menu {

    private String Overzicht;
    private String Boeken;
    private String Gebruikersinformatie;


    public void toonMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println();
        System.out.println("Welkom bij Readmember");
        System.out.println();
        System.out.println("===========================");
        System.out.println();
        System.out.println("1. Overzicht");
        System.out.println("2. Boeken");
        System.out.println("3. GebruikersInformatie");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("===========================");


        int keuze = scanner.nextInt();

        switch (keuze) {

            case 1:

                toonOverzicht();

                LocalDate beginDatum = LocalDate.now();
                LocalDate eindDatum = beginDatum.plusDays(7);
                int snelheid = 3;
                int aantalBladzijdes = 15;
                List<Boeken> gelezenBoeken = new ArrayList<>();
                List<Boeken> nogTeLezenBoeken = new ArrayList<>();

                Overzicht overzicht = new Overzicht(beginDatum, eindDatum, snelheid, aantalBladzijdes, nogTeLezenBoeken, gelezenBoeken);
                overzicht.toonOverzicht();
                break;


            case 2:
                toonBoeken();
                keuze = scanner.nextInt();
                switch (keuze) {
                    case 1:
                        String auteur = "H.D Carlton";
                        String titel = "Haunting Adeline";
                        String genre = "Dark Romance";
                        Boeken boeken = new Boeken(auteur, titel, genre);
                        boeken.toonBoeken();
                        break;

                    case 2:

                        break;

                }
                break;

            case 3:
                Gebruikersinformatie gebruikersinformatie = new Gebruikersinformatie();
                gebruikersinformatie.toonGebruikersinformatie();

                keuze = scanner.nextInt();
                switch (keuze) {

                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                }

                break;

            case 4:
                System.out.println("Programma wordt afgesloten");

            default:
                System.out.println("Verkeerde input, probeer opnieuw");
                scanner.nextLine();

        }
        scanner.close();
    }

    private void toonOverzicht() {
    }

    private void toonBoeken() {
    }
}