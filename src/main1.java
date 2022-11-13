import dataStructure.ListNode;
import dataStructure.TreeNode;
import dataStructure.Utils;
/*
 *数组操作：创建 打印
 *链表操作：创建 打印
 *树操作：创建 打印
 * */

public class main1 {
    public static void main(String[] args) {
        Solution so = new Solution();
        int target = 1;
        int[][] array2D = Utils.createArray2D("[[2,1,1],[2,3,1],[3,4,1]]");
        Utils.printArray2D(array2D);
        so.multiply("9", "9");
    }
}