package com.freesme.chain_of_responsibility_pattern.impl;

import com.freesme.chain_of_responsibility_pattern.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
 
   public ErrorLogger(int level){
      this.level = level;
   }
 
   @Override
   protected void write(String message) {    
      System.out.println("Error Console::Logger: " + message);
   }
}