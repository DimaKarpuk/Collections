package org.example;

public class Main {
    public static void main(String[] args) {
        Box bigBox = new BigBox("bigBox", 400, 600, 800);
        Box smallBox = new SmallBox("smallBox",200, 400, 600);

        Goods chair = new Goods("chair", 290, 440, 630);
        Goods toy = new Goods("toy", 100, 300, 450);
        Goods locker = new Goods("locker", 400, 600, 800);
        Goods iron = new Goods("iron", 20, 40, 35);


        ((BigBox) bigBox).putInABigBox(chair);
        ((BigBox) bigBox).putInABigBox(toy);
        ((BigBox) bigBox).putInABigBox(locker);
        ((BigBox) bigBox).putInABigBox(iron);
        ((BigBox) bigBox).searchBigBoxGoods(chair);
        ((BigBox) bigBox).deleteBigBoxGoods(chair);


        ((SmallBox) smallBox).putInASmallBox(chair);
        ((SmallBox) smallBox).putInASmallBox(toy);
        ((SmallBox) smallBox).putInASmallBox(locker);
        ((SmallBox) smallBox).putInASmallBox(iron);
        ((SmallBox) smallBox).searchSmallBoxGoods(chair);
        ((SmallBox) smallBox).deleteSmallBoxGoods(toy);

    }
}