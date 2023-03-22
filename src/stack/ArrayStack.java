package stack;

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

    /**
     * 栈中元素存在的个数
     * @return
     */
   public int length(){
       return this.top+1;
   }


    /**
     * 判断是否是一个运算符 + - * /
     */
    public boolean isOper(char v){
        return v=='+' ||v=='-' || v=='*' ||v=='/';
    }

    /**
     * 判断运算符的优先级，使用数字表示优先级大小，越大优先级越大
     */
    public int priority(int oper){
        if (oper=='*'||oper=='/'){
            return 1;
        } else if (oper=='+'||oper=='-') {
            return 0;
        }else{
            return -1;
        }
    }

    /**
     * 获取栈顶数据
     */
    public int peek(){
        return this.stack[top];
    }

    /**
     * 获取栈的容量
     */
    public int stackLength(){
        return this.stack.length;
    }

    /**
     * 两个数进行运算后的结果
     * 2-3  num1:3 num2:2(后进先出)
     */
    public int calculate(int num1,int num2,int oper){
        int result=0;
        switch (oper){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num2-num1;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num2/num1;
                break;
            default:break;
        }
        return result;
    }


}
