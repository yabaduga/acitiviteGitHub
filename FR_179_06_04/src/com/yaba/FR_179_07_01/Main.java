package com.yaba.FR_179_07_01;

public class Main {

    public static void main(String[] args) {

        Pile maPile=new Pile();
        // la pile est une liste !!
      //  maPile.add(5); = ceci est impossible suite à la mise en place de la délégation

        maPile.push(4);
        int v=maPile.pop();

    }
}
