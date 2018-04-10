package BinaryTree;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author grail
 * @Date 18-4-2 上午10:47
 */
public class TopK {
    /**
     * 实现topK问题
     *
     * @param nums
     * @param k
     * @return
     */
    public static int findK(int[] nums, int k) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();
        minQueue.comparator();
        for (int num : nums) {
            if (minQueue.size() < k || num > minQueue.peek()) {
                minQueue.add(num);
            }
            if (minQueue.size() > k) {
                minQueue.poll();
            }
        }
        return minQueue.peek();
    }

    /**
     * 实现priorityQueue大顶堆
     */
    public static void max(int[] nums) {
        PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int num : nums) {
            maxQueue.offer(num);
        }
        return;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 4, 3, 5, 2, 3};
        int k = 5;
        System.out.println(findK(nums, k));
        max(nums);
    }
}
