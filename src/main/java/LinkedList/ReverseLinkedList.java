package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author wb-zh306310
 * @create 2018/4/10 16:29
 */

/**
 * µπ≈≈LinkedList
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList newLinkedList = new LinkedList();
        for (int i = 0; i < 6; i++) {
            linkedList.add(i);
        }
        Iterator it = linkedList.iterator();
        int i = linkedList.size();
        while (it.hasNext() && i > 0) {
            newLinkedList.addFirst(it.next());
            i--;
        }
        System.out.println();
    }
}
