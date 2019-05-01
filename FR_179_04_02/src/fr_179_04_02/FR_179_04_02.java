package fr_179_04_02;

public class FR_179_04_02 {
    public static void main (String [] args){

Document doc = new Document("mon titre");
//doc.setTitre("nouveau titre")
       System.out.println(doc.affiche());
       doc= doc.ajouteUnMot("avec un ajout de mot");
       System.out.println(doc.affiche());
       String str1 ="coucou";
       String str2=str1;
       System.out.println(str2);
       str1="bonjour";
        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2); // on voit ici que même si on a modifier str1 et que str2 est censé être identique, str2 reste sur coucou
    }
}
