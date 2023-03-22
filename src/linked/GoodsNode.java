package linked;
/*
* 根据带有头部的单链表，实现商品增删改查，并且也可以针对商品已编号进行排序，完成排行榜
* */
/*
* 结点类
* */
public class GoodsNode {
    public int id;
    public String name;
    public double price;
    public GoodsNode next; //指向下一个结点

    public GoodsNode(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.next = next;
    }
}
