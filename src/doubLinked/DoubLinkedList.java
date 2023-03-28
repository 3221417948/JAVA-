package doubLinked;

//双向链表的基本操作
public class DoubLinkedList {

    private BooksNode head = new BooksNode(0, "", 0.0);

    /**
     * 尾插法添加新结点
     *
     * @param newNode
     */
    public void addLast(BooksNode newNode) {
        BooksNode temp = head;
        while (true) {
            //如果第一次进来是空，表示双向链表是空数据
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        /*
         * 需要把新的结点给上一个结点
         * 需要把上一个结点的next执向新的结点
         * */
        temp.next = newNode;
        newNode.front = temp;
    }

    /*
     * 修改结点
     * 条件：双向链表中的每一个结点的id和修改的id对比，如果对比成功，则进行修改
     *     如果没有对比成功，双向链表中未找到目标结点
     * */
    public void updateNode(BooksNode node) {
        //判断是否为空链表
        if (head.next == null) {
            System.out.println("空链表");
            return;
        }
        BooksNode temp = head.next;
        boolean flag = false;

        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.bId == node.bId) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.bName = node.bName;
            temp.bPrice = node.bPrice;
        } else {
            System.out.println("未找到要修改的结点");
        }

    }

    /**
     * 双向链表删除
     * 条件：根据id编号进行删除结点
     * @param id
     */
    public void deleteNode(int id){
        if (head.next == null) {
            System.out.println("空链表");
            return;
        }
        BooksNode temp = head.next;
        boolean flag = false;

        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.bId == id) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
           temp.front.next=temp.next;
           if(temp.next !=null){
               temp.next.front=temp.front;
           }
        } else {
            System.out.println("未找到要删除的结点");
        }

    }


}
