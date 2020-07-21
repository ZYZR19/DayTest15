package Day02;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-21
 * Time: 10:11
 */
public class Day02 {
    //输入一个链表，按链表从尾到头的顺序返回一个ArrayList
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         Stack<Integer> st = new Stack<>();
         while (listNode!=null) {
             st.push(listNode.val);
             listNode = listNode.next;
         }

            ArrayList<Integer> list = new ArrayList<>();
        while(!st.empty()){
            list.add(st.pop());
        }
        return list;
    }
}


