package com.freesme.abstract_factory_pattern;

import com.freesme.abstract_factory_pattern.colorpkg.Color;
import com.freesme.abstract_factory_pattern.factorypkg.AbstractFactory;
import com.freesme.abstract_factory_pattern.factorypkg.FactoryProducer;
import com.freesme.abstract_factory_pattern.shapepkg.Shape;

public class Domain {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.getColor("RED");
        red.fill();
    }
}
