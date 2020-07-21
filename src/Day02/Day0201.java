package Day02;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: asus
 * Date: 2020-07-21
 * Time: 22:41
 */
public class Day0201 {
    public void printHead (ArrayList<Integer>list, Day02.Day02.ListNode listNode) {
        if (listNode==null) {
            return;
        }
        printHead(list,listNode.next);
        list.add(listNode.val);
    }
    public  ArrayList<Integer> printHead(Day02.Day02.ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        printHead(list,listNode);
        return list;
    }
}
