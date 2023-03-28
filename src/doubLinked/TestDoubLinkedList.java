package doubLinked;

public class TestDoubLinkedList {
    public static void main(String[] args) {
        DoubLinkedList doubLinkedList=new DoubLinkedList();

        BooksNode booksNode1=new BooksNode(1,"红楼梦",100);
        BooksNode booksNode2=new BooksNode(2,"水浒传",66);
        BooksNode booksNode3=new BooksNode(3,"三国演义",70);
        BooksNode booksNode4=new BooksNode(4,"西游记",56);
        BooksNode booksNode5=new BooksNode(5,"活着",15);
        BooksNode booksNode6=new BooksNode(6,"安徒生童话故事",29.00);

        doubLinkedList.addLast(booksNode1);
        doubLinkedList.addLast(booksNode2);
        doubLinkedList.addLast(booksNode3);
        doubLinkedList.addLast(booksNode4);
        doubLinkedList.addLast(booksNode5);
        doubLinkedList.addLast(booksNode6);

        doubLinkedList.updateNode(new BooksNode(4,"c++实战开发",46));
       doubLinkedList.deleteNode(1);

        System.out.println("");

    }
}
