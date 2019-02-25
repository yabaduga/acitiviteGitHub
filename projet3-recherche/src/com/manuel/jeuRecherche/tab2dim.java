package com.manuel.jeuRecherche;

class tab2dim {
    public static void main(String[] args) {
        int premiersNombres[][] = {{0, 2, 4, 6, 8}, {1, 3, 5, 7, 9}}, i = 0, j = 0;
        while (i < 2) {
            j = 0;
            while (j < 5) {
                System.out.print(premiersNombres[i][j]);
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}