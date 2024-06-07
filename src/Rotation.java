public class Rotation {

    public static void rotationDroite(int[] tab) {

        /* Tout d'abord, je dois attribuer l'index 0,
        il est basé sur la table d'origine, donc il
        changera plus tard au cours de la boucle
         */
        tab[0] = tab[tab.length-1];

        /* Boucle qui doit s'exécuter à l'envers.
        Sinon, tab[i] sera toujours écrasé par la valeur suivante
         */
        for (int i = tab.length-1; i > 0; i--) {
            tab[i] = tab[i] - 1;
        }

    }

    public static void main(String[] args) {

        int[] tableau = {0, 1, 2, 3, 4, 5};

        // j'utilise la foncition
        rotationDroite(tableau);

        //print
        for (int number : tableau) {
            System.out.print(number + " ");
        }

    }
}
