package com.yaba.FR_179_04_06;

public class Document {

    private String titre;
    public void affiche(){
        System.out.println("Le titre est : " + titre);
    }
    public Document (String titre){
        this.titre=titre;
    }
}
