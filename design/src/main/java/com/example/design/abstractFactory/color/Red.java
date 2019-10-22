package com.example.design.abstractFactory.color;

/**
 * @author : Yang Jian
 * @date : 2019/10/22 0022 21:57
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
