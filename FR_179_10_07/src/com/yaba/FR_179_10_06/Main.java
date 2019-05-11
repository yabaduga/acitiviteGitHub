package com.yaba.FR_179_10_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ErreurDeConnexion extends Exception {
    ErreurDeConnexion (String msg, Exception cause) {
        super("Erreur de connexion : " +msg, cause);
    }
}
public class Main {

    public static void main(String[] args) {
        try {
            Connection cxt = ouvrirLaConnexion();
        } catch (ErreurDeConnexion e) {
            System.out.println(e);
        }
    }
        private static Connection ouvrirLaConnexion() throws ErreurDeConnexion {
            Connection cxt = null;

            try {
                cxt = DriverManager.getConnection("nomDeConnexion", "user", "pwd");

            } catch (SQLException e) {
                //.. rétablir - ex rollback
                throw new ErreurDeConnexion("pas de connexion possible", e);
            }
            return cxt;
        }
    }


