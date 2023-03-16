public class TestStack {
    public static void main(String[] args) {
        String str="6-1-3";

        /**
         * 1.需要遍历字符串，获取每一个数字和运算符
         * 2.把数字放入数字栈，符号放入符号栈
         * 3.运算符栈：空栈->入栈 有其他符号->判断优先级 新符<旧符 ->旧符弹出，数字栈数字弹出进行运算，结构重新翻入数字栈，新符进栈
         *   如果新符>旧符-> 新符直接入栈
         */

        ArrayStack numStack=new ArrayStack(10); //数字栈
        ArrayStack symbolStack=new ArrayStack(10); //符号栈

        /*获取字符串长度*/
        int temp1=0;
        int temp2=0;
        int symbolChar=0;
        int result=0;
        int length = str.length();
        String values="";
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i); //获取每一个字符
            //是否是一个运算符*
            if(symbolStack.isOper(c)){
                //如果不是一个空符号栈
                if(!symbolStack.isEmpty()){
                    //比较运算符的优先级
                    if (symbolStack.priority(c)<=symbolStack.priority(symbolStack.peek())) { //新符<=旧符
                        /**
                         * 1.去符号栈中获取栈顶的符号
                         * 2.去数字栈中获取两个数字
                         */
                        temp1 = numStack.pop();
                        temp2 = numStack.pop();
                        symbolChar=symbolStack.pop();
                        result=numStack.calculate(temp1,temp2,symbolChar);

                        //把运算结果放入数字栈中，并把当前符号压入符号栈中
                        numStack.push(result);
                        symbolStack.push(c);

                    }else {
                        symbolStack.push(c);
                    }
                }else {
                    //如果是空符号栈，直接压栈
                    symbolStack.push(c);
                }

            }else {
                //如果扫描的是数字。数字很能存在多位，比如33+44，如何能保证这多位数字
                //判断当前字符后一位是否是一个字符，如果是字符表示当前数字结束直接存入数字栈，如果不是字符，表示
                //这是一个多位数字
                values+=c;
                if (i==length-1){ //判断是否是最后一个数字
                    numStack.push(Integer.parseInt(values));
                }else {
                    char data = str.substring(i+1, i+2).charAt(0);
                    if (symbolStack.isOper(data)){
                        numStack.push(Integer.parseInt(values));
                        values="";
                    }
                }

            }
        }

        while (true){
            if(symbolStack.isEmpty()){
                break;
            }
            temp1=numStack.pop();
            temp2=numStack.pop();
            symbolChar=symbolStack.pop();
            result=numStack.calculate(temp1,temp2,symbolChar);
            numStack.push(result);
        }
        int res=numStack.pop();
        System.out.println("结果是："+res);
    }
}
