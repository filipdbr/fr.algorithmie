import java.util.Scanner;

public class InteractifPlusGrand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int max = numbers[0];

        System.out.println("Saisissez un nombre entier");


        for (int i = 0; i < 9; i++) {
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
                System.out.println("Entrez le prochain numéro de votre choix");
            } else {
                System.out.print("c'est pas un nombre entier. Réessayez");
                scanner.hasNextInt();
            }
        }

        System.out.println("Saisissez le dernier nombre entier");
        numbers[9] = scanner.nextInt();
        System.out.println("Merci !");

        scanner.close();

        for (int j : numbers) {
            if (j > max) {
                max = j;
            }
        }

        System.out.println();
        System.out.println("Merci !");
        System.out.println("Le plus grand nombre est: " + max);
    }
}
