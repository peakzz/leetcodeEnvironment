package dataStructure;

import dataStructure.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class Utils {
    //快排模板，填坑法
    static private void quickSort(int[] arr, int left, int right) {
        if (left >= right) {   //递归出口，左等于右说明划分到只剩一个元素了
            return;
        }
        int partitionIndex = partition(arr, left, right);
        quickSort(arr, left, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, right);
    }


     static  private  int partition(int a[], int left, int right){
        int pivot = a[left];//最左侧为枢轴，其实算是记录了left这个位置的数值，这个位置此时可以随意被其他数填充
        while(left < right){
            while(a[right] >= pivot && left  < right) right--;
            a[left] = a[right];
            while(a[left] < pivot && left < right) left++;
            a[right] = a[left];
        }
        a[left] = pivot;//将记录的数值填充回去
        return left;
    }




    //打印数组
    public static void printArray(int[] nums){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < nums.length; i++){
            sb.append(nums[i]+",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb.toString());
    }
    public static void printArray_2D(int[][] nums){
        for(int i = 0; i < nums.length; i++){
            printArray(nums[i]);
        }

    }




    //构造链表：输入字符串，输出链表头
    public static ListNode creatListNode(String s){
        String [] listNode = s.substring(1,s.length()-1).split(",");
        ListNode head0 = new ListNode(Integer.parseInt(listNode[0]));
        ListNode head = head0;
        for (String e: listNode) {
            head0.next = new ListNode(Integer.parseInt(e));
            head0 = head0.next;
        }
        return head.next;
    }

    //打印链表
    public static void printListNode(ListNode head0){
        ListNode head = head0;
        System.out.print("[");
        while(head != null){
            if(head.next == null){
                System.out.print(head.val+"]");

            }
            else{
                System.out.print(head.val+",");

            }
            head = head.next;

        }

    }
    //创建数，输入序列化字符串，返回root节点，水平遍历，叶子节点的左右直接点为null  如[1,2,null,null,3,null,null]
    public static TreeNode creatTree(String data) {
        if(data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{ add(root); }};
        int i = 1;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(!vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if(!vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
    //打印树：层次遍历,输入root，层次打印树
    public static void printTree(TreeNode root) {
        if(root == null) System.out.println("[]");
        StringBuilder sb = new StringBuilder("[");
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp != null){
                sb.append(root.val+",");
                q.offer(temp.left);
                q.offer(temp.right);
            }else{
                sb.append("null,");
            }

        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb.toString());
    }
}
