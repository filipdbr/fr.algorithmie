import java.util.HashSet;

public class ComparisonTableauSet {

    // Création de la classe pour comparer des tableaux
    private static class Comparer {

        private int[] tab1;
        private int[] tab2;

        // Constructeur de la classe
        public Comparer (int[] tab1, int[] tab2) {
            this.tab1 = tab1;
            this.tab2 = tab2;
        }

        // Methode pour trouver des elements en commun
        public int encommun() {
            HashSet<Integer> set1 = new HashSet<Integer>();
            HashSet<Integer> set2 = new HashSet<Integer>();

            //ajouter des elements au sets
            for (int i : tab1) {
                set1.add(i);
            }

            for (int i : tab2) {
                set2.add(i);
            }

            // elements en commun
            set1.retainAll(set2);

            return set1.size();

        }

    }

    public static void main(String[] args) {

        int[] tableau1 = {1, -15, 3, 0, 8, 7, 4, 2, 28, -7, 1, 7, 2, 3, 0, 14, -4};
        int[] tableau2 = {3, -8, 17, 5, -1, 4, 0 ,6, 2, 11, -5, -4, -8};

        Comparer elementsEnCommun = new Comparer(tableau1, tableau2);

        System.out.println("Le nombre d'elements en commun est: " + elementsEnCommun.encommun());

    }

}
