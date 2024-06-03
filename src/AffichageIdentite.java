import java.util.Scanner;

public class AffichageIdentite {
    public static void main(String[] args) {
        System.out.println("Entrer votre identifiant:");
        Scanner scanner = new Scanner(System.in); // option pour saisir l'identifiant par un utilisateur

            String id = scanner.nextLine();
            System.out.println("Votre identifiant: ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " " + id); // L'ID est répété 10 fois
            }
    }
}
