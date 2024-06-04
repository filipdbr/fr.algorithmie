public class FirstLast {

    private static boolean firstLast (int[] tab){

        if (tab.length < 1) {
            return false;
        }
        return tab[0] == tab[tab.length-1];

    }

    public static void main(String[] main) {

        int[] tableau1 = {6,2,3,4,6};
        System.out.println(firstLast(tableau1));

        int[] tableau2 = {0,2,3,4,6};
        System.out.println(firstLast(tableau2));

        int[] tableau3 = {};
        System.out.println(firstLast(tableau3));

        int[] tableau4 = {6};
        System.out.println(firstLast(tableau4));

        int[] tableau5 = {1,2,3,4,5,1};
        System.out.println(firstLast(tableau5));

    }


}
