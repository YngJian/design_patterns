package com.example.design.abstractFactory;

import com.example.design.abstractFactory.color.Color;
import com.example.design.abstractFactory.shape.Circle;
import com.example.design.abstractFactory.shape.Rectangle;
import com.example.design.abstractFactory.shape.Shape;
import com.example.design.abstractFactory.shape.Square;

/**
 * @author : Yang Jian
 * @date : 2019/10/22 0022 22:01
 */
public class ShapFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    private static final String CIRCLE = "circle";
    private static final String RECTANGLE = "rectangle";
    private static final String SQUARE = "square";

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (CIRCLE.equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if (RECTANGLE.equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        } else if (SQUARE.equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
