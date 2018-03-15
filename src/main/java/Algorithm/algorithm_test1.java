package Algorithm;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class algorithm_test1 {
    public boolean Find(int target, int[][] array) {
        for (int arr[] : array) {
            for (int arrInt : arr){
                if (arrInt == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        algorithm_test1 test1 = new algorithm_test1();
        boolean test = test1.Find(5,new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}});
        System.out.println(test);
    }
}
