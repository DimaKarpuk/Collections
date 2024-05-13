package org.example;

public class Box {
   public final String name;
    public final Integer width,
    height,
    depth;
    public Box(String name, Integer width, Integer height, Integer depth) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
