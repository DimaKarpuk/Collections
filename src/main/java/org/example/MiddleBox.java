package org.example;

import java.util.*;

public class MiddleBox extends Box {
    public Queue<String> goodsQueue;

    public MiddleBox(String name, Integer width, Integer height, Integer depth) {
        super(name, width, height, depth);
        goodsQueue = new LinkedList<>();
    }
    public String putInAMiddleBox(Goods goods) {
        if (width >= goods.width && height >= goods.height
                && depth >= goods.depth) {
            goodsQueue.add(goods.name);
            System.out.println("В " + name + " помещается " + goods.name);
        }
        return name;
    }
    public String searchMiddleBoxGoods(Goods goods){
        if (goodsQueue.contains(goods.name)) {
            System.out.println("В контейнере " + name + " есть " + goods.name);
        }else {
            System.out.println("В контейнере " + name + " отсутствует " + goods.name);

        }
        return goods.name;
    }
    public String deleteMiddleBoxGoods(){
        while (!goodsQueue.isEmpty()) {
            System.out.println("Удаляем из "+ name + " первый в очереди товар " + goodsQueue.poll());
            break;
        }
        return name;
    }
    public List<MiddleBox> middleBoxList(){
        System.out.println("В middleBox лежит " + goodsQueue+"\n");
        return null;
    }
}