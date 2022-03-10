 public static void main(String[] args) {
        ListNode node4 = new ListNode(1,null);
        ListNode node3 = new ListNode(2,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);


        boolean b = new Bytes().isPalindrome(node1);
        System.out.println(b);
    }

    public boolean isPalindrome(ListNode head) {
        // 声明一个栈
        Deque<Integer> list = new LinkedList<>();
        ListNode xhead = head;
        // 链表入栈
        while (head!=null) {
            list.push(head.val);
            head = head.next;
        }

        while (xhead!=null) {
            if (list.peek() != xhead.val) {
                System.out.println(111);
                return false;
            }
            list.pop();
            xhead = xhead.next;
        }
        return true;
    }



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


