package FR_179_06_05;


public class Bibliotheque {

  private   Document[] lesdocs;

     class Parcours extends SensDeParcours {

         private int indice=0;

         @Override
         public boolean hasNext() {
             return indice < lesdocs.length;
         }

         @Override
         public Document next() {
             return lesdocs[indice];
         }
     }

     public SensDeParcours getParcours() {
         return new Parcours();
     }
}