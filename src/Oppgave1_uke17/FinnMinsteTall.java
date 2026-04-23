package Oppgave1_uke17;

public class FinnMinsteTall {

     public static void main(String[] args) {
         int[] tab = new int[] {15, 8, 1, 9, 11, 5, 10, 12};
         insertionMod(tab, 4);
         System.out.println();

         int[] tab2 = new int[] {15, 8, 1, 9, 11, 5, 10, 12};
         selectionMod(tab2, 3);
         System.out.println();

         int[] tab3 = new int[] {15, 8, 1, 9, 11, 5, 10, 12};
         heapMod(tab3, 5);
         System.out.println();
     }

    private static void insertionMod(int[] tab, int k) {
        for (int i = 1; i< k; i++) {
            int key = tab[i];
            int j = i-1;

            while (j>=0 && tab[j] >key) {
                tab[j+1] = tab[j];
                j--;
            }
            tab[j+1] = key;
        }
        for (int i = k; i < tab.length; i++) {
            if (tab[i] < tab[k-1]) {
                int key = tab[i];
                int j = k-2;

                while (j>=0 && tab[j] >key) {
                    tab[j+1] = tab[j];
                    j--;
                }
                tab[j+1] = key;
            }
        }

        for (int i = 0; i<k; i++) {
            System.out.print(tab[i] + " ");
        }

    }

    /*
    Den nye orden for innsettingsmetoden blir ved beste tilfelle O(n) og ved
    verste tilfelle O(n*k)
     */


    private static void selectionMod(int[] tab, int k) {
         for (int i = 0; i<k; i++) {
             int min = i;

             for (int j = i+1; j<tab.length; j++) {
                 if (tab[j] < tab[min]) {
                     min = j;
                 }
             }

             int temp = tab[i];
             tab[i] = tab[min];
             tab[min] = temp;
         }

        for (int i = 0; i<k; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    /*
    Den nye orden for utvalgssmetoden blir uansett O(n*k)
     */

    private static void heapMod(int[] tab, int k) {

        // bygg maks-heap
        for (int i = k / 2 - 1; i >= 0; i--) {
            heapify(tab, k, i);
        }

        for (int i = k; i < tab.length; i++) {
            if (tab[i] < tab[0]) {
                tab[0] = tab[i];
                heapify(tab, k, 0);
            }
        }

        for (int i = 1; i < k; i++) {
            int key = tab[i];
            int j = i - 1;

            while (j >= 0 && tab[j] > key) {
                tab[j + 1] = tab[j];
                j--;
            }
            tab[j + 1] = key;
        }

        for (int i = 0; i<k; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    private static void heapify(int[] tab, int n, int i) {
        int storst = i;
        int venstre = 2 * i + 1;
        int hoyre = 2 * i + 2;

        if (venstre < n && tab[venstre] > tab[storst]) {
            storst = venstre;
        }

        if (hoyre < n && tab[hoyre] > tab[storst]) {
            storst = hoyre;
        }

        if (storst != i) {
            int temp = tab[i];
            tab[i] = tab[storst];
            tab[storst] = temp;

            heapify(tab, n, storst);
        }
    }
    /*
    Den nye orden for heapmetoden blir  O(n*log(k))
    */

}
