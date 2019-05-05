package com.yaba.FR_179_08_00;

public class Main {

    public static void main(String[] args) {

        Document doc = new Document("le document");

                Pile<Document> maPile = new Pile<Document>(5);
        maPile.push(doc);

        Document d=maPile.pop();

        Pile<Integer> maPile2 = new Pile<Integer>(10);
        maPile2.push(new Integer(4));
        Integer i = maPile2.pop();
    }
}
