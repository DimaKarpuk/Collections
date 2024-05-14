package org.example;

import java.util.HashSet;
import java.util.Set;

public class BigBox extends Box {

    public Set<String> goodsSet;

    public BigBox(String name, Integer width, Integer height, Integer depth) {
        super(name, width, height, depth);
        goodsSet = new HashSet<>();
    }

    public String putInABigBox(Goods goods) {
        if (width >= goods.width && height >= goods.height
                && depth >= goods.depth) {
            goodsSet.add(goods.name);
            System.out.println("В " + name + " помещается " + goods.name);
        }
        return null;
    }
    public String searchBigBoxGoods(Goods goods){
        if (goodsSet.contains(goods.name)) {
            System.out.println("В контейнере " + name + " есть " + goods.name);
        }else {
            System.out.println("В контейнере " + name + " отсутствует " + goods.name);

        }
        return null;
    }
    public String deleteBigBoxGoods(Goods goods){
        while (goodsSet.contains(goods.name)){
            goodsSet.remove(goods.name);
            System.out.println("Удаляем из " + name + " " + goods.name);
        }
        return null;
    }
    public Set<String> stringSet(){
        System.out.println("В bigBox лежит " + goodsSet+"\n");
        return null;
    }
}
