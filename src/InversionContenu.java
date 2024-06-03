public class InversionContenu {

    public static void main(String[] args) {

        int[] tab = {1, -5, 3, 0, 8, 7, 4, 2, -8, 7, 1, 7, 2, 3, 0, 14, -4};

        int[] arrayCopy = new int[tab.length]; // creating a copy

        // manual copy by for loop
        for (int i = 0; i < tab.length; i++) {
            arrayCopy[i] = tab[tab.length - (i + 1)];
        }

        // printing the result of a copy
        System.out.print("arrayCopy: ");
        for (int i = 0; i < arrayCopy.length; i++) {
            if (i != arrayCopy.length - 1) {
                System.out.print(arrayCopy[i] + ", ");
            } else {
                System.out.print(arrayCopy[i]); // printing without a coma for the last index
            }
        }

        System.out.println();
        System.out.print("array original: ");
        for (int i = 0; i < tab.length; i++) {
            if (i != tab.length-1) {
                System.out.print(tab[i] + ", ");
            } else {
                System.out.print(tab[i]); // printing without a coma for the last index
            }

        }
    }
}



