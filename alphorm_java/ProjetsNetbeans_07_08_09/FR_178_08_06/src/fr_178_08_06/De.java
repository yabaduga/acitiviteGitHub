package fr_178_08_06;

public class De {
   public int valeurFace;

    public int rouler() {
     int min=1,max=6,range=max-min;
     valeurFace=(int)(Math.random()*range+min);
     return valeurFace;
System.out.println(("le dé vaut : " + d1));
    }
   public int getValeurFace(){
        return valeurFace;
    }

    public void setValeurFace(int f) {
        this.valeurFace = f;
    }

}