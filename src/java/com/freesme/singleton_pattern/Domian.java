package com.freesme.singleton_pattern;

public class Domian {
    public static void main(String[] args) {
        SingletonEnum.INSTACE.setNum(1);
        int n = SingletonEnum.INSTACE.getNum();
        System.out.println(n);
    }
}
