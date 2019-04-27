/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetsmetiers;

/**
 *
 * @author fabien
 */
public class Livre extends Document{


    String auteur="inconnu";

    public Livre(String titre, String auteur) {

        super(titre);
        this.auteur=auteur;
    }
    @Override
    public String getInfos() {

        return super.getInfos() +" de "+auteur;
    }

}
