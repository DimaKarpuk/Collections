package org.example;

import java.util.ArrayList;
import java.util.List;

public class SmallBox extends Box{

    public List<String> goodsList;

    public SmallBox(String name, Integer width, Integer height, Integer depth) {
        super(name, width, height, depth);
        goodsList = new ArrayList<>();
    }

    public String putInASmallBox(Goods goods) {
        if (width >= goods.width && height >= goods.height
                && depth >= goods.depth) {
            goodsList.add(goods.name);
            System.out.println("В " + name + " помещается " + goods.name);
        }
        return name;
    }
    public String searchSmallBoxGoods(Goods goods){
        if (goodsList.contains(goods.name)) {
            System.out.println("В контейнере " + name + " есть " + goods.name);
        }else {
            System.out.println("В контейнере " + name + " отсутствует " + goods.name);

        }
        return goods.name;
    }
    public String deleteSmallBoxGoods(Goods goods){
        while (goodsList.contains(goods.name)){
            goodsList.remove(goods.name);
            System.out.println("Удаляем из " + name + " " + goods.name);
        }
        return goods.name;
    }
}
