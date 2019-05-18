package com.yaba.FR_179_15_00;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection cxt = DriverManager.getConnection("jdbc:mysql://SrvBDD:3306/alphbdd", "UserDB", "!VizirD8!");

            Statement st = cxt.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM persons");

            while (rs.next()) {
                String nom = rs.getString("LastName");
               String prenom = rs.getString("FirstName");
               String age = rs.getString("Age");
                System.out.println("le nom est : " + nom);
           System.out.println("le prénom est : " + prenom);
           System.out.println("l'age est de : " + age + " ans");
           System.out.println();
            }
            st.close();
            cxt.close();

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}