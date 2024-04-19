import java.time.LocalDate;
import java.util.*;

class Menu {
    public Menu() {}

    public void toonMenu() {
        Scanner scanner = new Scanner(System.in);


        int keuze = -1;
        while (keuze != 4) {
            System.out.println("===========================");
            System.out.println("Welkom bij Readmember");
            System.out.println("===========================");
            System.out.println("1. Overzicht");
            System.out.println("2. Boeken");
            System.out.println("3. GebruikersInformatie");
            System.out.println("4. Exit");
            System.out.println("===========================");
             keuze = scanner.nextInt();

            switch (keuze) {
                case 1:
                    toonOverzicht();
                    break;
                case 2:
                    toonBoekenMenu(scanner);
                    break;
                case 3:
                    toonGebruikersinformatie();
                    break;
                case 4:
                    System.out.println("Programma wordt afgesloten");
                    break;
                default:
                    System.out.println("Verkeerde input, probeer opnieuw");
            }

        }
        scanner.close();
    }


    private void toonOverzicht() {
        System.out.println(" || Overzicht || ");
        LocalDate beginDatum = LocalDate.now();
        LocalDate eindDatum = beginDatum.plusDays(7);
        int snelheid = 3;
        int aantalBladzijdes = 15;
        List<Boeken> gelezenBoeken = new ArrayList<>();
        List<Boeken> nogTeLezenBoeken = new ArrayList<>();

        Overzicht overzicht = new Overzicht(beginDatum, eindDatum, snelheid, aantalBladzijdes, nogTeLezenBoeken, gelezenBoeken);
        overzicht.toonOverzicht();
    }

    private void toonBoekenMenu(Scanner scanner) {
        System.out.println(" || Boeken || ");
        System.out.println("Wat wil je doen met dit boek?");
        System.out.println("1. Zie Boek informatie");
        System.out.println("2. Voeg notitie toe");
        System.out.println("3. Voeg nieuw boek toe");
        System.out.println("4. Voeg beoordeling toe");

        int keuze = scanner.nextInt();

        Boeken boeken = new Boeken();

        switch (keuze) {
            case 1:
                boeken.toonBoekInformatie();
                break;
            case 2:
                Notitie notitie = new Notitie();

                notitie.voegNotitieToe(scanner);
                break;
            case 3:
                boeken.voegNieuwBoekToe(scanner);
                break;
            case 4:

                Beoordeling beoordeling = new Beoordeling();
                beoordeling.voegBeoordelingToe(scanner, new Gebruikersinformatie());

                break;
            default:
                System.out.println("Verkeerde input, probeer opnieuw");
        }
    }

    private void toonGebruikersinformatie() {
        System.out.println(" || Gebruikersinformatie || ");
        Gebruikersinformatie gebruikersinformatie = new Gebruikersinformatie();
        gebruikersinformatie.toonGebruikersinformatie();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.toonMenu();
    }
}