public class SommeDeTableaux {

    public static void main(String[] args) {

        int[] tab1 = {1, -15, 3, 0, 8, 7, 4, 2, 28, -7, 1, 7, 2, 3, 0, 14, -4};
        int[] tab2 = {1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, 13, 5, 7, -2, 8, -1};
        int[] sum = new int[tab1.length];

 //       System.out.print(tab1.length == tab2.length); // Les tables sont de la même longueur

        for (int i = 0; i < tab1.length; i++) {
            sum[i] = tab1[i] + tab2[i];
        }

        for (int i : sum) {
            System.out.print(i + " ");
            }

    }
}
