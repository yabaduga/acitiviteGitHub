package com.yaba.FR_179_15_04.dao;

import com.yaba.FR_179_15_04.métier.Person;

public class FabriqueDAO {
    public static FabriqueDAO getInstance() {
        return new FabriqueDAO();
    }

    public PersonDAO getPersonDAO() {
        //cette fabrique concerne mysql
        return new PersonMYSQLDAO() {

            public Person getPerson(int i) {
                return null;
            }
        };


    }

}