package com.yaba.FR_179_05_03;

public class Main {

    public static void traite(Fichier f, String cmde) {
        if (cmde.equals("executer")) {
            if (f instanceof Executable)
                ((Executable)f).executer();

        } else if (cmde.equals("afficher")) {
            if(f instanceof Affichable)
            ((Affichable) f).afficher();
        } else {
            System.out.println("Opération impossible");
        }
    }
        public static void main (String[]args){
            Fichier f = new FichierBinaire();

            traite(f, "executer");
        }
    }
