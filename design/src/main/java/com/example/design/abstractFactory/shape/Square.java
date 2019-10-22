package com.example.design.abstractFactory.shape;

/**
 * @author : Yang Jian
 * @date : 2019/10/22 0022 21:39
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
