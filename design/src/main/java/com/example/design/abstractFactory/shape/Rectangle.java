package com.example.design.abstractFactory.shape;

/**
 * @author : Yang Jian
 * @date : 2019/10/22 0022 21:38
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Rectangle::draw() method.");
    }
}
