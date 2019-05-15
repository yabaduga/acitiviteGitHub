package com.yaba.FR_179_14_01;

import java.util.Stack;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Ressource {
    Stack <String> st = new Stack <>();

    ReentrantReadWriteLock lck= new ReentrantReadWriteLock();
      String lire() {
          for (int i = 0; i < 20; i++)
              st.push("blabla " + i);

          String str="";
          lck.readLock().lock();
          try {

              str = st.pop();
          }
          finally {
              lck.readLock().unlock();
              System.out.println("str "+ str);

          }
          return str;
     }

}