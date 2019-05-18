package com.yaba.FR_179_15_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

public static void creerDocument(Connection cxt) throws Exception {


    Statement st = cxt.createStatement();


    st.execute("INSERT INTO persons (Lastname, FirstName, Age) VALUES ('Trongolisto','Bobby','79')");

    st.close();
}
    public static void main(String[] args) throws Exception {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            Connection cxt = DriverManager.getConnection("jdbc:mysql://SrvBDD:3306/alphbdd", "UserDB", "!VizirD8!");
            creerDocument(cxt);

        Statement st = cxt.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM persons");

            while (rs.next()) {
                String nom = rs.getString("LastName");
                System.out.println("Résultats :"+ nom);
            }
st.close();
    }
}