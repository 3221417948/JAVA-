package linked;

/*
 * 链表
 * */
public class DLLinkedList {
    private GoodsNode node = new GoodsNode(0, "", 0.0); //构建头节点

    /**
     * 添加结点
     */
    public void add(GoodsNode goodsNode) { //尾插法
        GoodsNode temp = node;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if(temp.next.id==goodsNode.id){
                break;
            }
            temp = temp.next;
        }
        temp.next = goodsNode;
    }

    /**
     * 按照商品编号id进行添加，从小到大顺序
     */
    public void addByOrder(GoodsNode goodsNode) {
        GoodsNode temp = node;
        boolean flag = false;

        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.id > goodsNode.id) {
                break;
            } else if (temp.next.id == goodsNode.id) { //找到
                flag = true;
                break;
            }
            temp = temp.next;
        }
            if (flag){
                System.out.println("该商品已经存在，不能再次添加！");
            }else {
                goodsNode.next=temp.next;
                temp.next=goodsNode;
            }
        }


    /**
     * 修改结点
     * @param goodsNode
     */
    public void updateNode(GoodsNode goodsNode){
        if (node.next==null){
            System.out.println("链表已空");
            return;
        }
        GoodsNode temp=node.next;
        boolean flag=false;
        while (true){
            if (temp==null){
                break;
            }
            if (temp.id==goodsNode.id){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag){
            temp.name=goodsNode.name;
            temp.price= goodsNode.price;
        }else {
            System.out.println("没有找到该结点");
        }
    }

    /**
     * 删除结点
     */
    public void delNode(int id){
        GoodsNode temp=node;
        boolean flag=false;

        while (true){
            if(temp.next==null){
                break;
            }
            if (temp.next.id==id){
                flag=true;
                break;
            }
            temp=temp.next;
        }

        if(flag){
            temp.next=temp.next.next;
        }else {
            System.out.println("要删除的信息不存在！");
        }
    }

    /**
     * 定义查看链表中每一个结点元素
     */
    public void list(){
        if(node.next==null){
            System.out.println("空链表");
            return;
        }
        GoodsNode temp=node.next;
        while (true){
            if(temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }

    /**
     * 链表倒转
     * @param goodsNode
     */
    public void reverse(GoodsNode goodsNode){
        if(goodsNode.next==null || goodsNode.next.next==null){
            return;
        }
        GoodsNode point=goodsNode.next;
        GoodsNode next=null;
        GoodsNode reverseNode=new GoodsNode(0,"",0.0);

        while (point !=null){
            next=point.next;
            point.next=reverseNode.next;
            point=next;
        }
        goodsNode.next=reverseNode.next;

    }

    /**
     * 面试题
     * 计算单链表中存在的结点个数
     * 不统计头结点
     * @return
     */
    public int getLength(){
        if(node.next==null){
            System.out.println("空链表");
            return 0;
        }
        GoodsNode temp=node.next;
        int length=0;
        while (temp !=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
}
