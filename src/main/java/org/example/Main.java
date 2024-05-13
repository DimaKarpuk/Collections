package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Box bigBox = new Box("bigBox", 400, 600, 800, new HashSet<>());
        Box smallBox = new Box("smallBox",200, 400, 600, new HashSet<>());

        Goods chair = new Goods("chair", 290, 440, 630);
        Goods toy = new Goods("toy", 100, 300, 450);
        Goods locker = new Goods("locker", 400, 600, 800);
        Goods iron = new Goods("iron", 20, 40, 35);


        bigBox.putInABox(chair);
        smallBox.putInABox(chair);
        bigBox.putInABox(toy);
        smallBox.putInABox(toy);
        bigBox.putInABox(locker);
        smallBox.putInABox(locker);
        bigBox.putInABox(iron);
        smallBox.putInABox(iron);

        smallBox.searchGoods(chair);
        bigBox.searchGoods(chair);

        smallBox.deleteGoods(chair);
        bigBox.deleteGoods(chair);
    }
}