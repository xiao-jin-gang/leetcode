// 代码
public class Solution {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(4,null);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);

        ListNode node23 = new ListNode(4,null);
        ListNode node22 = new ListNode(3,node23);
        ListNode list21 = new ListNode(1,node22);
        Solution solution = new Solution();
        ListNode mergeTwoLists = solution.mergeTwoLists(node1, list21);
        //构建链表
        while (mergeTwoLists!=null){
            System.out.println(mergeTwoLists.val);
            mergeTwoLists = mergeTwoLists.next;
        }
    }
   // 提交代码部分
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode list3 = node;
        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
                list3.next = list2;
                list3 = list3.next;
                list2 = list2.next;
            }else {
                list3.next = list1;
                list3 = list3.next;
                list1 = list1.next;
            }
        }
        if (list1 == null ){
            list3.next = list2;
        }
        if (list2 == null ){
            list3.next = list1;
        }
        return node.next;
    }
}
// 链表节点定义
public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
}
