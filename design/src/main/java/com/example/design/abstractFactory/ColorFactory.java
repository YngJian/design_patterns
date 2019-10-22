package com.example.design.abstractFactory;

import com.example.design.abstractFactory.color.Blue;
import com.example.design.abstractFactory.color.Color;
import com.example.design.abstractFactory.color.Green;
import com.example.design.abstractFactory.color.Red;
import com.example.design.abstractFactory.shape.Shape;

/**
 * @author : Yang Jian
 * @date : 2019/10/22 0022 22:02
 */
public class ColorFactory extends AbstractFactory {
    private static final String RED = "red";
    private static final String GREEN = "green";
    private static final String BLUE = "blue";

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (RED.equalsIgnoreCase(color)) {
            return new Red();
        } else if (GREEN.equalsIgnoreCase(color)) {
            return new Green();
        } else if (BLUE.equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
