package dataStructure;

public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public static synchronized void synMethod() {
       System.out.println("同步方法执行中..");
      }
 }