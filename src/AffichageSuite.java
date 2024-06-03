public class AffichageSuite {
    public static void main(String[] args) {
        System.out.println("Tous les nombres de 1 à 10 inclus (boucle for):");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("tous les nombres pairs entre 0 et 10 inclus (boucle for):");
        for (int i = 0; i <= 10; i+=2) {
        System.out.println(i);
        }
        System.out.println("tous les nombres impairs entre 0 et 9 inclus (boucle for):");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("Tous les nombres de 1 à 10 inclus (boucle while):");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("tous les nombres pairs entre 0 et 10 inclus (boucle while):");
        int j = 0;
        while (j <=10) {
            System.out.println(j);
            j += 2;
        }
        System.out.println("tous les nombres impairs entre 0 et 9 inclus (boucle while):");
        int k = 1;
        while (k <=9) {
            System.out.println(k);
            k += 2;
        }
    }
}
