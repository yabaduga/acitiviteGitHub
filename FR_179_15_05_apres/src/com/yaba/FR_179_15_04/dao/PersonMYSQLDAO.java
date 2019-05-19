package com.yaba.FR_179_15_04.dao;

import com.yaba.FR_179_15_04.métier.Person;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


public abstract class PersonMYSQLDAO implements PersonDAO {

    public Person getNom(int id) {
        Person pers=null;
        try {
            String url = "jdbc:mysql://SrvBDD:3306/alphbdd";

            RowSetFactory maFabrique = RowSetProvider.newFactory();
            JdbcRowSet jdbcRS = maFabrique.createJdbcRowSet();
            jdbcRS.setUrl(url);
            jdbcRS.setUsername("UserDB");
            jdbcRS.setPassword("!VizirD8!");

            String SQL = "SELECT * FROM persons WHERE personid =?";
            jdbcRS.setCommand(SQL);
            jdbcRS.setInt(1,id);
            jdbcRS.execute();

            while (jdbcRS.next()) {

                pers = new Person (id,jdbcRS.getString(1));
                System.out.println("ID : " + jdbcRS.getString(1));
                System.out.println("Nom : " + jdbcRS.getString(2));
                System.out.println("Prénom : " + jdbcRS.getString(3));
                System.out.println("Age : " + jdbcRS.getString(3));
                System.out.println();
            }


        } catch (Exception exp) {
            System.out.println("impossible d'accéder aux infos");
        }
        return pers;
    }
}