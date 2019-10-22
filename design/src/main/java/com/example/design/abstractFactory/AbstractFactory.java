package com.example.design.abstractFactory;

import com.example.design.abstractFactory.color.Color;
import com.example.design.abstractFactory.shape.Shape;

/**
 * @author : Yang Jian
 * @date : 2019/10/22 0022 22:00
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
