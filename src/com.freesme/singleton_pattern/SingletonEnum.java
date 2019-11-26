package com.freesme.singleton_pattern;

public enum SingletonEnum {
    INSTACE;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
