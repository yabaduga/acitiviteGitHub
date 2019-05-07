package com.yaba.FR_179_08_04;

import java.util.*;

public class Pile<T> {

    private Deque <T> datas = new LinkedList <>();

    {

    }
    void push(T valeur) {
        datas.addFirst(valeur);
    }

    T pop() {
        return datas.removeFirst();
    }
}
