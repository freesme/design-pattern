package com.freesme.abstract_factory_pattern.factorypkg;

import com.freesme.abstract_factory_pattern.colorpkg.Blue;
import com.freesme.abstract_factory_pattern.colorpkg.Color;
import com.freesme.abstract_factory_pattern.colorpkg.Red;
import com.freesme.abstract_factory_pattern.shapepkg.Shape;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      }  else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}