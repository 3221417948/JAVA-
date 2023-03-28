package doubLinked;

//图书结点类（双链表）
public class BooksNode {
    public int bid; //图书编号
    public String bname; //图书名称
    public double bPrice; //图书价格

    public BooksNode next; //指针指向下一个结点
    public BooksNode front;//指针指向上一个节点

    public BooksNode(int bid, String bname, double bPrice) {
        this.bid = bid;
        this.bname = bname;
        this.bPrice = bPrice;
    }
}
