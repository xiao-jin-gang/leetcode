class MyQueue {

    Deque<Integer> inStack;  // 入栈 Deque代替了Stack
    Deque<Integer> outStack; // 出栈

    public MyQueue() {
        inStack = new LinkedList<Integer>();
        outStack = new LinkedList<Integer>();
    }
    // 入队进入队尾
    public void push(int x) {
        inStack.push(x);
    }
    // 弹出队列
    public int pop() {
        if (outStack.isEmpty()) {      		// ****判断出栈是否为空，为空才能继续入栈到OutStack,否则会将刚输进去的出队列
            while (!inStack.isEmpty()){
                //第一个出到第二个栈
                outStack.push(inStack.pop());
            }            
        }
        // 出队列
        return outStack.pop();
    }
    // 查看队列
    public int peek() {
        if (outStack.isEmpty()) {		// ****判断出栈是否为空，为空才能继续入栈到OutStack
            while (!inStack.isEmpty()){
                //第一个出到第二个栈
                outStack.push(inStack.pop());
            }
        }

        return outStack.peek();
    }
    // 队列是否为空
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}




