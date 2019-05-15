package com.yaba.FR_179_14_00;

import java.util.concurrent.atomic.AtomicInteger;

class Compteur {

    private AtomicInteger valeur= new AtomicInteger(0);

    int retournUniqueIndex() {
        return valeur.getAndDecrement();
    }
}
