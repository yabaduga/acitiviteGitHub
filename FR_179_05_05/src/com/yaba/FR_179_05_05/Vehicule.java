package com.yaba.FR_179_05_05;

class Vehicule {

    String modele;
    @Override
    public boolean equals(Object obj)
    {
        boolean retval=false;
        if (obj instanceof Vehicule) {
            Vehicule autre = (Vehicule)obj;
            if(autre.modele.equals(modele))
                retval=true;
        }
        return retval;
    }
}
