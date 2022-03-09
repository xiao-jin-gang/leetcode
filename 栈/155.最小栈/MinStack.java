class MinStack {
    Deque<Integer> xStack;      // 原有栈
    Deque<Integer> minStack;    // 辅助栈
    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);   //初始化辅助栈
    }
    // 入栈
    public void push(int val) {
        xStack.push(val);
        minStack.push(Math.min(minStack.peek(),val)); // 辅助栈
    }
    // 出栈
    public void pop() {
        xStack.pop();
        minStack.pop();
    }
    // 删除栈顶
    public int top() {
        return xStack.peek();
    }
    //获取现有堆栈中的最小元素。
    public int getMin() {
        return minStack.peek();
    }
}




/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。

	实现 MinStack 类:

MinStack() 初始化堆栈对象。
void push(int val) 将元素val推入堆栈。
void pop() 删除堆栈顶部的元素。
int top() 获取堆栈顶部的元素。
int getMin() 获取堆栈中的最小元素。

输入：
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

输出：
[null,null,null,null,-3,null,0,-2]

解释：
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.


 */