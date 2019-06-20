package GeeksforGeeks;

import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {

        int i, j,n, zob;
        Scanner sc= new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        System.out.println("Saisissez la longueur de votre tableau : ");
       n=sc.nextInt();
       // int[] myArray = {4, 2, 1, 5, 3};
        int myArray[];
        myArray= new int [n];

        for (zob=0; zob<myArray.length;zob++){

            System.out.println("Entrez les valeurs pour le tableau");
            myArray[zob]=input.nextInt();
        }

        for (i = 1; i < myArray.length; i++) {
            j = 0;
            if (myArray[i] < myArray[j]) {
                System.out.print( myArray[i] + " ");


            } else {
                System.out.print( "-1 " );
            }
            j++;
        }

    }
}
