package com.yaba.FR_179_07_04;

public class Main {

    public static void main(String[] args) {

        DocumentDAO doc = FabriquePersistance.createDocumentDAO();
        Document d=doc.creer();
    }
}
