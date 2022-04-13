package com.principal;

public enum Prioridade {
    MIN(2), NORMAL(6), MAX(12);

    private int i;

    Prioridade(int i) {
        this.i = i;
    }

    public int getI(){
        return this.i;
    }
}
