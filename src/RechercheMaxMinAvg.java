public class RechercheMaxMinAvg {

    public static void main(String[] args) {

        int[] tab = {1, -5, 3, 0, 8, 7, 4, 2, -8, 7, 1, 7, 2, 3, 0, 14, -4};

        int max = tab[1]; // max = premier entier lequel je vais comparer avec des autre entiers pendant loop
        int min = tab[1]; // le min marche pareil que le max
        int sum = 0;

        for (int j : tab) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
            sum += j;
        }

        double avg = (double) sum / (tab.length-1);

        System.out.println("Le plus grand élément est " + max);
        System.out.println("Le plus petit élément est " + min);
        System.out.println("La moyenne est " + avg);

    }
}
