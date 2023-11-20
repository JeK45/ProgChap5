package Cours1;

class Demo {

    Demo() {
        int[] tab = {1,2,3,4,5,6,7,8,-9};

    }

    int[] triBulle(int[] tab) {
        return tab;
    }

    static int[] inversion(int[] tab) {
        int tmp;
        tmp = tab[0];
        tab[0] = tab[1];;
        tab[1] = tmp;

        return tab;
    }

    static int fouille(int[] tab, int recherche) {
        int i = 0;
        boolean trouve = false;

        while (i < tab.length && !trouve) {
            if (recherche == tab[i]) {
                trouve = true;
            } else {
                i++;
            }
        }

        return trouve ? i : -1;
    }
}
