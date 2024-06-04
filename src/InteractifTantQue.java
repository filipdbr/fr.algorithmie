import java.util.Scanner;

public class InteractifTantQue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nombre;

        System.out.println("Saissisez un nombre ");

        do {
            try {
                nombre = scanner.nextInt();
                if (nombre <= 0 || nombre >= 10) {
                    System.out.println("Ce nombre est pas entre 1 et 10.");
                    System.out.println("Réessayez");
                } else {
                    System.out.println("Votre nombre est " + nombre);
                    scanner.close();
                    return;
                }
            } catch (Exception e) {
                System.out.println("Vous devez mettre un nombre entier. Redémarrez et réessayez.");
                scanner.close();
                return;
            }

        } while (true);
    }
}



