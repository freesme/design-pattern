package com.freesme.decorator_pattern;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    //核心 重写父类方法 调用父类中的方法，重写的方法中增加需求
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decorateShape){
        System.out.println("Broder color: Red");
    }
}
