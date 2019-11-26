package com.freesme.factory_pattern;

/**
 * 工厂模式
 * 创建对象时不会对客户端暴露创建逻辑，而是通过一个共同的接口来指向新创建的对象
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if (shapeType.equals("CIRCLE")){
            return new Circle();
        }else if (shapeType.equals("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equals("SQUARE")){
            return new Square();
        }
        return null;
    }
}
