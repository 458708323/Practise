package Algorithm;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。{67,0,24,58}
 */
public class algorithm_test3 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        if (arrayList.size()!= 0){
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        algorithm_test3 test3 = new algorithm_test3();
        ListNode listNode = null;
        test3.printListFromTailToHead(listNode);
    }
}
