package com.yaba.FR_179_07_01;

public class Pile extends Liste implements Empilable{

private int valeur=0;

@Override
    public void push(int v){
        valeur++;
        add(v);
    }
@Override
    public int pop() {
        return get(valeur--);
    }
}
