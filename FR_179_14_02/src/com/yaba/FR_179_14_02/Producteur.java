package com.yaba.FR_179_14_02;

import java.util.concurrent.BlockingQueue;

class Producteur implements Runnable{
    BlockingQueue data;
    Producteur (BlockingQueue q){
        data = q;
    }
   @Override
    public void run() {
       for (int i=0;i<1000;i++){
           try {
               data.put(new Integer(i));
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("Placement de la data " );

       }


    }
}
