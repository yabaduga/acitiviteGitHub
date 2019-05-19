package com.yaba.FR_179_15_04;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            // System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        String url = "jdbc:mysql://SrvBDD:3306/alphbdd";
        try {
            RowSetFactory maFabrique = RowSetProvider.newFactory();
            JdbcRowSet jdbcRS = maFabrique.createJdbcRowSet();
            jdbcRS.setUrl(url);
            jdbcRS.setUsername("UserDB");
            jdbcRS.setPassword("!VizirD8!");

            String SQL = "SELECT * FROM persons";
            jdbcRS.setCommand(SQL);
            jdbcRS.execute();

            while (jdbcRS.next()) {
                System.out.println("ID : " + jdbcRS.getString(1));
                System.out.println("Nom : " + jdbcRS.getString(2));
                System.out.println("Prénom : " + jdbcRS.getString(3));
                System.out.println("Age : " + jdbcRS.getString(3));
                System.out.println();
            }

        } catch (SQLException SQLex) {
            System.out.println("Erreur de SQL");
        }

    }
}
