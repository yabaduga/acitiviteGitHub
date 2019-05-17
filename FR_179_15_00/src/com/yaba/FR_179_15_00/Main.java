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