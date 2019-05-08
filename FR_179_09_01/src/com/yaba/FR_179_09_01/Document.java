package com.yaba.FR_179_09_01;

public class Document {
    String titre;
    Document (String titre) {
     this.titre=titre;

    }
@Override
    public String toString() {
        return "le titre " +titre;
    }
}
