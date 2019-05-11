package com.yaba.FR_179_10_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class ErreurDeConnection extends Exception {
    ErreurDeConnection (String message, Exception cause) {
        super(message, cause);
    }
}
public class Main {

    public static void main(String[] args) {
        Connection cxt = ouvrirLaConnexion();
        //....
    }

    private static Connection ouvrirLaConnexion() {
        Connection cxt = null;
        try {
            cxt = DriverManager.getConnection("nomDeConnection", "user", "pwd");

        } catch (SQLException e) {
            System.out.println("Erreur SQL : "+e);

        }
        return cxt;
    }

}