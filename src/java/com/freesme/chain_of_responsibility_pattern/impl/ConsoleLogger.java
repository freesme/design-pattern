package com.freesme.chain_of_responsibility_pattern.impl;

import com.freesme.chain_of_responsibility_pattern.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
 
   public ConsoleLogger(int level){
      this.level = level;
   }
 
   @Override
   protected void write(String message) {    
      System.out.println("Standard Console::Logger: " + message);
   }
}