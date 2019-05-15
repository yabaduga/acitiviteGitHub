package com.yaba.FR_179_14_01;

import java.util.Stack;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Ressource {
Stack<String> st = new Stack<>();
ReentrantReadWriteLock lck= new ReentrantReadWriteLock();
      String lire() {
          String str="";
          lck.readLock().lock();
          try {
               str = st.pop();
          }
          finally {
              lck.readLock().unlock();
          }
          return str;
     }
 }
