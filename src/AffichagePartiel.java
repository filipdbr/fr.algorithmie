public class AffichagePartiel {

    public static void main(String[] args) {

        int[] tab = {1, -5, 3, 0, 8, 7, 4, 2, -8, 7, 1, 7, 2, 3, 0, 14, -4};

        // Les entiers supérieurs à 3
        System.out.print("Les entiers supérieurs à 3: ");
        for (int j : tab) {
            if (j > 3) {
                System.out.print(j + " ");
            }
        }

        System.out.println();

        // Les valeurs correspondant aux index pairs
        System.out.print("Les valeurs correspondant aux index pairs: ");
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.print(tab[i] + " ");
            }
        }

        System.out.println();

        // qu'entier pairs
        System.out.print("Qu'entier pairs: ");
        for (int j : tab) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

    }
}
