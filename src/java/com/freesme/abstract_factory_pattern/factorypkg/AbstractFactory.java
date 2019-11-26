package com.freesme.abstract_factory_pattern.factorypkg;

import com.freesme.abstract_factory_pattern.colorpkg.Color;
import com.freesme.abstract_factory_pattern.shapepkg.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shapeType);
}
