public class AffichageInverse {
    public static void main(String[] args) {

        // 1. L'ensemble des éléments
        int[] tab = {1, -5, 3, 0, 8, 7, 4, 2, -8, 7, 1, 7, 2, 3, 0, 14, -4};

        System.out.println("L'ensemble des éléments du tableau grâce à une boucle:");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();

        // 2. des éléments dans l'ordre inverse
        System.out.println("L'ensemble des éléments dans l'ordre inverse du tableau:");
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }

        System.out.println();

        // Copy
        System.out.println("Copier tous les éléments de array dans arrayCopy");

        int[] arrayCopy = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            arrayCopy[i] = tab[i];
        }

        for (int i = 1; i < arrayCopy.length; i++) {
            System.out.println(arrayCopy[i]);
        }

        System.out.println("Vérification si les tableaux sont les mêmes (si faux arrayCopy est une copie:");
        System.out.println(tab == arrayCopy);

        int[] arrayCopy2 = new int[tab.length];

        System.arraycopy(arrayCopy, 0, arrayCopy2, 0, arrayCopy.length);

        for (int i = 0; i < arrayCopy2.length; i++) {
            System.out.print(arrayCopy2[i] + ", ");
        }

        System.out.println();
        System.out.println(arrayCopy == arrayCopy2);

    }
}