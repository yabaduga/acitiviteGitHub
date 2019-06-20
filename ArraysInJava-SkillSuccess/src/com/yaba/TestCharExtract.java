package com.yaba;

import java.util.Arrays;
import java.util.Scanner;

public class TestCharExtract {
    public static void main(String[] args) {
        int[] CombiArray = {1, 2, 3, 4};
        int populateVCombo;
        int vWin=0;

        int[] myArray = {0, 0, 0, 0};

       do {

            Scanner sc = new Scanner( System.in );
            System.out.println( "Saisissez une combinaison de 4 nombres :" );
            String vCombo = sc.nextLine();
            for (int i = 0; i < 4; i++) {
                String sousVCombo = vCombo.substring( i, (i + 1) );
                //System.out.println( sousVCombo );
                populateVCombo = Integer.parseInt( sousVCombo );
                myArray[i] = populateVCombo;
                //System.out.println("La case " + i + " du tableau vaut " + populateVCombo);
            }
            for (int j = 0; j < 4; j++) {
                if (myArray[j] == (CombiArray[j])) {
                    System.out.print( "=" );

                } else if (myArray[j] > CombiArray[j]) {
                    System.out.print( "-" );
                } else if (myArray[j] < CombiArray[j]) {
                    System.out.print( "+" );
                }

            }

if (myArray[0]==CombiArray[0] && myArray[1]==CombiArray[1] && myArray[2]==CombiArray[2] && myArray[3]==CombiArray[3]){
    vWin=1;
}
       }
       while (vWin !=1);
        System.out.println( "Bravo, la combinaison était bien : " + Arrays.toString(CombiArray) );

    }
}