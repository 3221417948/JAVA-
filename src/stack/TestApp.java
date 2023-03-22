package stack;

import stack.ArrayStack;

public class TestApp {
    public static void main(String[] args) {
        /**
         * 回文数据
         * 回文： aba racecar
         * 需求：通过上面以数组模拟栈来判断一个字符串是否是一个回文数据 
         */

        //System.out.println(detecation("hello"));
        System.out.println(detecation("aba"));
    }

    public static boolean detecation(String value) {
        /*初始化对象*/
        ArrayStack arrayStack = new ArrayStack(10);

        /*获取字符串长度*/
        int length = value.length();

        /*把字符串数据逐次获取字符并压栈至数组中*/
        for (int i = 0; i < length; i++) {
            arrayStack.push(value.charAt(i));
        }

        /*获取*/
        String newVal = "";
        int length1=arrayStack.length(); //目的是固定长度
        for (int i = 0; i < length1; i++) {
            //是否是一个空栈
            if (!arrayStack.isEmpty()) {
                char pop = (char) arrayStack.pop();
                newVal += pop;
            }
        }
        if (value.equals(newVal)) {
            return true;
        }
        return false;
    }
}
