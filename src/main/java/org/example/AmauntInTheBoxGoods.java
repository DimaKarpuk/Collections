package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class AmauntInTheBoxGoods {
    HashMap<String,Integer> boxAndAmaunt = new LinkedHashMap<>();

    public AmauntInTheBoxGoods() {
        this.boxAndAmaunt = boxAndAmaunt;
    }
    public String putInAHashMap(Box box, Integer integer) {
        boxAndAmaunt.put(box.name, integer);
        System.out.println("В карту добавили " + box.name);
        return null;
    }
    public LinkedHashMap<String, Integer> searchLinkedHashMapBox(Box box){
        if(boxAndAmaunt.containsKey(box.name)){
            System.out.println("В карте есть " + box.name);
        }else {
            System.out.println("В карте нет " + box.name);
        }
        return null;
    }
    public LinkedHashMap<String, Integer> deleteElementLinkedHashMapBox(Box box){
        boxAndAmaunt.remove(box.name);
            System.out.println("Удаляем из карты " + box.name);
        return null;
        }
    public LinkedHashMap<String, Integer> stringHashMap(){
        if (!boxAndAmaunt.isEmpty()) {
            System.out.println("В карте находятся " + boxAndAmaunt);
        }
        return null;
    }
}