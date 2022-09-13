import dataStructure.ListNode;
import dataStructure.TreeNode;
import dataStructure.Utils;

import java.util.LinkedList;
import java.util.List;

//生成链表示例：dataStructure.ListNode head = creatListNode("[2,5,7,9]") 输入String 返回值：dataStructure.ListNode head
//打印链表示例： printListNode(dataStructure.ListNode head);  返回值：void
//打印LinkedList：System.out.println(list.toString() );
public class main1 {
    public static void main(String[] args) {
        Solution so = new Solution();
        int[][] matrix = new int[][]{
                {1, 3}, {-2, 2}};
        // System.out.println( so.threeSum(new int[]{-1,0,1,2,-1,-4}));
//        dataStructure.ListNode l1 = Help.creatListNode("[-10,-3,0,5,9]");
//        dataStructure.ListNode l2 = Help.creatListNode("[5,6,4,9]");

        String[] str = new String[]{"8888"};
        // so.kClosest(matrix,1);
        // System.out.println( so.openLock(aa));
        //  System.out.println(so.serialize(root));
        // dataStructure.TreeNode a = so.deserialize(data);
        // printTree(a);
        // s = [1,2,3,1,null,2,null,null,null,null,null,1,null,null,null]
        ListNode l1 = Utils.creatListNode("[1,1,2,1]");
        ListNode l2 = Utils.creatListNode("[5,6,4]");
        String begin = "a", end = "c";
        List<String> list = new LinkedList<>();
        String[] ss = new String[]{"a", "b", "c"};
        for (int i = 0; i < ss.length; i++) {
            list.add(ss[i]);
        }
        TreeNode root = Utils.creatTree("[1,2,3,null,5]");
        int[] arr = new int[]{5,2,3,1};

        int[][] mat = new int[][]{{1,1,0,0,1},{1,0,0,0,0},{1,1,0,0,1},{0,1,0,1,1}};

       // so.frequencySort();

    }
}





