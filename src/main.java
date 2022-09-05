

//生成链表示例：src.ListNode head = creatListNode(int [] nums)  返回值：src.ListNode head
//打印链表示例： printListNode(src.ListNode head);  返回值：void
//打印LinkedList：System.out.println(list.toString() );

// int [][] nums = new int[][]{{1,3},{2,6},{8,10},{15,18}};
// src.TreeNode nums = new src.TreeNode(7);

public class main {
    public static void main(String[] args) {
        Solution so = new Solution();


        int[] aa = new int[]{1};

       // System.out.println( so.threeSum(new int[]{-1,0,1,2,-1,-4}));

        ListNode l1 = Help.creatListNode("[2,4,9]");
        ListNode l2 = Help.creatListNode("[5,6,4,9]");
        System.out.println("a".compareTo("abbb"));
        so.frequencySort("tree");
      //  System.out.println(so.serialize(root));
      // src.TreeNode a = so.deserialize(data);
      // printTree(a);
    }

    static  private int findRight(int[] nums, int target){
        int i = 0, j = nums.length - 1;
        while(i < j){
            int mid = i + (j-i)/2;
            if(target == nums[mid]) i = mid + 1;
            else if (target > nums[mid]) i = mid + 1;
            else j = mid;
        }
        return i ;
    }



}


