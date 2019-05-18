package FR_179_15_03;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void creerDocument(Connection cxt) throws Exception {
        Statement st = cxt.createStatement();
        st.execute("INSERT INTO persons (LastName, FirstName, Age) values ('MonNom', 'MonPrénom','28')");
        st.close();
    }

    public static void main(String[] args) {
        Connection cxt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            cxt = DriverManager.getConnection("jdbc:mysql://SrvBDD:3306/alphbdd", "UserDB", "!VizirD8!");
            cxt.setAutoCommit(false);
            //creerDocument(cxt);

            PreparedStatement st = cxt.prepareStatement("SELECT * FROM persons WHERE LastName=?");
            Scanner sc = new Scanner(System.in);

            String monNom = sc.nextLine();
            st.setString(1, monNom); // ici on peut directement passer le paramètre - exemple st.setString(1,"ANTUNES");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                String nom = rs.getString("LastName");
                String prenom = rs.getString("FirstName");
                String age = rs.getString("Age");
                System.out.println("Résultats : " + nom + " " + prenom + ", " + age + " ans");
            }
            st.close();
            cxt.commit();

        } catch (ClassNotFoundException cnf) {
            System.out.println("le pilote est introuvable");
            try {
                cxt.rollback();
            } catch (SQLException ex) {
                System.out.println("souci SQL, rollback");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                cxt.rollback();
            } catch (SQLException ex) {
                System.out.println("souci SQL, rollback");
            }
        } catch (IllegalAccessException e) {
            System.out.println("Erreur d'instanciation du driver");
        } catch (InstantiationException e) {
            System.out.println("Erreur d'instanciation du driver");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                try {
                    cxt.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } finally {
                try {
                    cxt.close();
                } catch (SQLException ex) {
                    System.out.println("Erreur SQL");
                }
            }

        }
    }
}