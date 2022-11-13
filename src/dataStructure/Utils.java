package dataStructure;

import dataStructure.ListNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Utils {
    /**
     * 数组相关操作  创建 打印
     * @param s
     */

    //创建一维数组  输入：[1,2,3] 返回 int[]{1,2,3}
    public static int[] createArray(String s){
        String[] strs = s.substring(1, s.length() - 1).split(",");
        int[] array = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            array[i] = Integer.valueOf(strs[i]);
        }

        return array;
    }
    //创建二维数组  输入：[[2,1,1],[2,3,1]] 返回 int[][]{{1,2,3},{2,3,1}}
    public static int[][] createArray2D(String s){
        s = s.substring(1, s.length() - 1);
        String temp = "";
        List<int[]> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            temp += s.charAt(i);
            if (s.charAt(i) == '[') {
                temp = "[";
            }
            if (s.charAt(i) == ']'){
                list.add(createArray(temp));
            }
        }
        return list.toArray(new int[0][0]);
    }

    //print Array
    public static void printArray(int[] nums){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < nums.length; i++){
            sb.append(nums[i]+",");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb.toString());
    }

    //print Array2D
    public static void printArray2D(int[][] nums){
        for(int i = 0; i < nums.length; i++){
            printArray(nums[i]);
        }
    }

    /**
     * 链表相关操作
     * @param s
     * @return
     */
    //构造链表：输入字符串 [1,2,4] ，返回链表头 ListNode(1)
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

    //打印链表：输入链表头ListNode(1)，打印 [1,2,4]
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
    //创建树，输入序列化字符串，返回root节点，水平遍历，叶子节点的左右直接点为null  如[1,2,null,null,3,null,null]
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
