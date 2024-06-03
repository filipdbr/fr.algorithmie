public class ComparaisonTableau {

    public static void main(String[] args) {

        int[] tab1 = {1, -15, 3, 0, 8, 7, 4, 2, 28, -7, 1, 7, 2, 3, 0, 14, -4};
        int[] tab2 = {3, -8, 17, 5, -1, 4, 0 ,6, 2, 11, -5, -4, -8};

        int numOfElements = 0;

        // La boucle compte combien d'élément donné de la première fonction
        // apparaît dans la seconde. Il existe cependant des doublons
        for (int i = 0; i < tab1.length; i++) {

            for(int j = 0; j <tab2.length; j++) {
                if (tab1[i] == tab2[j]) {
                    numOfElements++;
                }
            }
        }

        // Voici, le nombre avec des doublons donc je vais faire cet exercice en utilisant les sets
        System.out.println(numOfElements);

    }

}
