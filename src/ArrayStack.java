import java.util.Scanner;

//静态栈 数组实现
public class ArrayStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    }

    private  int maxStack; //栈的大小
    private int[] stack; //数组模拟栈
    private int top=-1; //表示栈顶 默认值为1

    /**
     *
     * @param maxStack 初始化栈的大小
     */
    public ArrayStack(int maxStack) {
        this.maxStack = maxStack;
        this.stack=new int[this.maxStack];
    }

    /**
     * 判断是否已经满栈
     * @return
     */
   public boolean isFull(){
        return this.top==maxStack-1;
   }

    /**
     * 是否空栈
     */
   public boolean isEmpty(){
       return this.top==-1;
   }

    /**
     * 入栈
     * @param value  值
     */
   public void push(int value){
       if(isFull()){
           throw new RuntimeException("栈已满...");
       }
       top++;
       stack[top]=value;
   }

    /**
     * 出栈
     * @return
     */
   public int pop(){
       if (isEmpty()){
           throw new RuntimeException("空栈，没有数据");
       }
       int value=stack[top];
       top--;
       return value;
   }
   public void list(){
       if (isEmpty()){
           throw new RuntimeException("空栈，没有数据");
       }
       for (int i = 0; i < stack.length; i++) {
           System.out.printf("stack[%d]=%d\n",i,stack[i]);
       }
   }
}
