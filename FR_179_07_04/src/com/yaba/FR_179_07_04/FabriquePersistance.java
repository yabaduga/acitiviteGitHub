package com.yaba.FR_179_07_04;

public class FabriquePersistance {

    public static DocumentDAO createDocumentDAO() {

        //.. prendre en compte le type d'accès aux données
return new OracleDocumentDAO();
    }
}
