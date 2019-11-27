package com.freesme.interpreter_pattern;

//表达式接口
public interface Expression {
   public boolean interpret(String context);
}