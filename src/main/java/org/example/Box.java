package org.example;

import java.util.Set;

public class Box {
   public final String name;
    public final Integer width,
    height,
    depth;
    public final Set<String> getGoods;

    public Box(String name, Integer width, Integer height, Integer depth, Set<String> getGoods) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.getGoods = getGoods;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", getGoods=" + getGoods +
                '}';
    }

    public String putInABox( Goods goods) {
        if (width >= goods.width && height >= goods.height
                && depth >= goods.depth) {
            getGoods.add(goods.name);
            System.out.println("В " + name + " помещается " + goods.name);
        }
        return name;
    }
    public String searchGoods(Goods goods){
        if (getGoods.contains(goods.name)) {
            System.out.println("В контейнере " + name + " есть " + goods.name);
        }else {
            System.out.println("В контейнере " + name + " отсутствует " + goods.name);

        }
        return goods.name;
    }
    public String deleteGoods(Goods goods){
        while (getGoods.contains(goods.name)){
            getGoods.remove(goods.name);
            System.out.println("Удаляем из " + name + " " + goods.name);
        }
        return goods.name;
    }
}
