package linked;

public class TestLinked {
    public static void main(String[] args) {
        DLLinkedList linkedList = new DLLinkedList();

        GoodsNode goodsNode1 = new GoodsNode(1, "耐克运动鞋", 599.00);
        GoodsNode goodsNode2 = new GoodsNode(2, "耐克上衣", 399.00);
        GoodsNode goodsNode3 = new GoodsNode(3, "耐克运动休闲裤", 299.00);
        GoodsNode goodsNode4 = new GoodsNode(4, "阿迪达斯运动鞋", 899.00);
        GoodsNode goodsNode5 = new GoodsNode(5, "李宁卫衣", 299.00);

        /*linkedList.add(goodsNode1);
        linkedList.add(goodsNode2);
        linkedList.add(goodsNode3);
        linkedList.add(goodsNode4);
        linkedList.add(goodsNode5);
        linkedList.add(goodsNode5);*/

        linkedList.addByOrder(goodsNode5);
        linkedList.addByOrder(goodsNode1);
        linkedList.addByOrder(goodsNode3);
        linkedList.addByOrder(goodsNode2);

        linkedList.list();

        linkedList.updateNode(new GoodsNode(2,"耐克太阳帽",198.0));
        linkedList.list();

        linkedList.delNode(3);
        linkedList.list();


    }
}
