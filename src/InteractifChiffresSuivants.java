import java.util.Scanner;

public class InteractifChiffresSuivants {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int nombre;

        System.out.println("Saissisez un nombre entier");
        do if (scanner.hasNextInt()) {

            nombre = scanner.nextInt();

            System.out.println("Les 10 nombres suivants: ");

            for (int i = nombre + 1; i < nombre + 11; i++) {
                System.out.print(i + " ");
            }

            scanner.close();
            return;

        } else {
            System.out.println("Vous devez mettre un nombre entier. Redémarrez et réessayez.");
            scanner.nextLine();
        } while (true);
    }
}