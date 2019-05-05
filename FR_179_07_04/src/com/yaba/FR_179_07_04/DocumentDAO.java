package com.yaba.FR_179_07_04;



public interface DocumentDAO {

    //;; proposer le CRUD (create, read, update, delete
    Document creer();
    Document recuperer(long id);
    Document modifier(Document doc);
   boolean delete(Document doc);

}
