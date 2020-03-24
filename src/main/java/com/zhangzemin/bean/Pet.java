package com.zhangzemin.bean;

/**
 * @author zhangzemin
 * @date 2020/3/24 12:40
 */
public class Pet {

    private String color;
    private String eat;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "color='" + color + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }
}
