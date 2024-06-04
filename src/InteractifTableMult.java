import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nombre;

        System.out.println("Saissisez un nombre entre 1 et 10 (inclus)");

        do {
            if (scanner.hasNextInt()) {

                nombre = scanner.nextInt();

                if (nombre > 0 && nombre <= 10) {

                    System.out.println("Table de " + nombre);
                    int i = 1;

                    while (i <= 10) {
                        System.out.println(nombre + " * " + i + " = " + nombre*i);
                        i++;
                    }

                } else {
                    System.out.println("Ce nombre est pas entre 1 et 10.");
                    System.out.println("Réessayez");
                }

            } else {
 //               System.out.println("Vous devez mettre un nombre entier. Redémarrez et réessayez.");
                scanner.nextLine();
            }

        } while (true);
    }
}

