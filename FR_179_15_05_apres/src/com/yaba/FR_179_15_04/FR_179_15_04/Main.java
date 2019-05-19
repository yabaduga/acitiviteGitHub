package com.yaba.FR_179_15_04.FR_179_15_04;

import com.yaba.FR_179_15_04.dao.*;
import com.yaba.FR_179_15_04.métier.*;



public class Main {

    public static void main(String[] args) throws Exception {

        FabriqueDAO fab = FabriqueDAO.getInstance();
        PersonDAO pd = fab.getPersonDAO();
        Person p = pd.getPerson(1);
        System.out.println("ID : " + p.getNom());


    }
}
