/*
Dans cette classe, au lieu de créer une méthode void,
je retournerai un nouveau tableau
*/

public class RotationDeuxiemeOption {

    public int[] rotationDroite(int[] tab) {

        int[] rotated = new int[tab.length];

        /* Tout d'abord, je dois attribuer l'index 0,
        il est basé sur la table d'origine, donc il
        changera plus tard au cours de la boucle
         */
        rotated[0] = tab[tab.length-1];

        /* Boucle qui doit s'exécuter à l'envers.
        Sinon, tab[i] sera toujours écrasé par la valeur suivante
         */
        for (int i = tab.length-1; i > 0; i--) {
            rotated[i] = tab[i] - 1;
        }

        return rotated;

    }

    public static void main(String[] args) {

        int[] tableau = {0, 1, 2, 3, 4, 5};

        /* Afin de créer un nouveau tableau et d'utiliser cette méthode,
        il faut que j'instance cette classe
         */
        RotationDeuxiemeOption r = new RotationDeuxiemeOption();
        int[] rotatedTab = r.rotationDroite(tableau);

        // print
        for (int number : rotatedTab) {
            System.out.print(number + " ");
        }

    }
}

