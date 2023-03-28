package doubLinked;

//图书结点类（双链表）
public class BooksNode {
    public int bId; //图书编号
    public String bName; //图书名称
    public double bPrice; //图书价格

    public BooksNode next; //指针指向下一个结点
    public BooksNode front;//指针指向上一个节点

    public BooksNode(int bId, String bName, double bPrice) {
        this.bId = bId;
        this.bName = bName;
        this.bPrice = bPrice;
    }
}
