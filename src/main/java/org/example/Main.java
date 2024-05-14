package org.example;

public class Main {
    public static void main(String[] args) {
        BigBox bigBox = new BigBox("bigBox", 400, 600, 800);
        SmallBox smallBox = new SmallBox("smallBox",200, 400, 600);
        MiddleBox middleBox = new MiddleBox("MiddleBox",300, 500, 700);
        AmauntInTheBoxGoods amauntInTheBoxGoods= new AmauntInTheBoxGoods();


        Goods chair = new Goods("chair", 290, 440, 600);
        Goods toy = new Goods("toy", 100, 300, 450);
        Goods locker = new Goods("locker", 400, 600, 800);
        Goods iron = new Goods("iron", 20, 40, 35);


        bigBox.putInABigBox(chair);
        bigBox.putInABigBox(toy);
        bigBox.putInABigBox(locker);
        bigBox.putInABigBox(iron);
        bigBox.searchBigBoxGoods(iron);
        bigBox.deleteBigBoxGoods(locker);
        bigBox.stringSet();


        middleBox.putInAMiddleBox(chair);
        middleBox.putInAMiddleBox(toy);
        middleBox.putInAMiddleBox(locker);
        middleBox.putInAMiddleBox(iron);
        middleBox.searchMiddleBoxGoods(toy);
        middleBox.deleteMiddleBoxGoods();
        middleBox.middleBoxQueue();


        smallBox.putInASmallBox(chair);
        smallBox.putInASmallBox(toy);
        smallBox.putInASmallBox(locker);
        smallBox.putInASmallBox(iron);
        smallBox.searchSmallBoxGoods(chair);
        smallBox.deleteSmallBoxGoods(toy);
        smallBox.stringList();

        amauntInTheBoxGoods.putInAHashMap(bigBox,3);
        amauntInTheBoxGoods.putInAHashMap(middleBox,2);
        amauntInTheBoxGoods.putInAHashMap(smallBox, 1);
        amauntInTheBoxGoods.searchLinkedHashMapBox(bigBox);
        amauntInTheBoxGoods.deleteElementLinkedHashMapBox(smallBox);
        amauntInTheBoxGoods.stringHashMap();
    }
}