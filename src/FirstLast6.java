public class FirstLast6 {

    private static boolean firstLast6(int[] tab) {

        if (tab.length < 1) {
            return false;
        }
        return tab[0] == 6 || tab[tab.length - 1] == 6;

    }

    public static void main(String[] args) {

        int[] tableau1 = {6,2,3,4,6};
        System.out.println(firstLast6(tableau1));

        int[] tableau2 = {0,2,3,4,6};
        System.out.println(firstLast6(tableau2));

        int[] tableau3 = {};
        System.out.println(firstLast6(tableau3));

        int[] tableau4 = {6};
        System.out.println(firstLast6(tableau4));




    }


}