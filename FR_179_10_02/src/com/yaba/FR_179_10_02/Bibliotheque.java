package com.yaba.FR_179_10_02;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private List<Livre> lesLivres = new ArrayList <>();
    public void ajoute(Livre livre) throws LivreEnDoubleException {

        for(Livre l:lesLivres) {
            if(l.getTitre().equalsIgnoreCase(livre.getTitre())) {
                throw new LivreEnDoubleException(livre.getTitre());
            }
        }
     lesLivres.add(livre);
    }
}
