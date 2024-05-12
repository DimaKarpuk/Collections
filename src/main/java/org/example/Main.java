package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Box bigBox = new Box("bigBox", 400, 600, 800, new HashSet<>());
        Box middleBox = new Box("middleBox",300, 500, 700, new HashSet<>());
        Box smallBox = new Box("smallBox",200, 400, 600, new HashSet<>());

        Goods chair = new Goods("chair", 290, 440, 630);


            if (smallBox.width >= chair.width && smallBox.height >= chair.height
            && smallBox.depth >= chair.depth) {
                smallBox.setGoods.add(chair.name);
            }else if (middleBox.width >= chair.width && middleBox.height >= chair.height
                    && middleBox.depth >= chair.depth){
            middleBox.setGoods.add(chair.name);
            }else if (bigBox.width >= chair.width && bigBox.height >= chair.height
                    && bigBox.depth >= chair.depth) {
                bigBox.setGoods.add(chair.name);
            }
        System.out.println(bigBox);
        System.out.println(middleBox);
        System.out.println(smallBox);
    }

}