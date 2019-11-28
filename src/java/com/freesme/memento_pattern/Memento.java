package com.freesme.memento_pattern;

/**
 * 保存要被恢复的对象的状态
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
