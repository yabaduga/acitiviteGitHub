package com.yaba.FR_179_14_02;

import java.util.concurrent.BlockingQueue;

class Consommateur implements  Runnable{
    BlockingQueue data;
    Consommateur (BlockingQueue q){
        data = q;
    }
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            Object o = null;
            try {
                o = data.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("récup de la data " + o);

        }


    }
}
