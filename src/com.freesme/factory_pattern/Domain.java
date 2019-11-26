package com.freesme.factory_pattern;

/**
 *
 * 工厂模式测试 复杂对象适合使用工厂模式
 * 一个调用者想创建一个对象，只要知道其名称就可以，通过工厂获取对象
 *
 * 需要有一个 产品 的接口（产品大类）和具体的接口实现类
 * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * 主要解决：主要解决接口选择的问题。
 *
 */
public class Domain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
