package org.example;

import java.util.Set;

public class Box {
    String name;
    Integer width; // (ширина)
    Integer height;// (высота)
    Integer depth; // (глубина)
    Set<String> setGoods;

    public Box(String name, Integer width, Integer height, Integer depth, Set<String> setGoods) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.setGoods = setGoods;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", setGoods=" + setGoods +
                '}';
    }

}
