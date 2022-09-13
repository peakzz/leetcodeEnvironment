package dataStructure;

import dataStructure.Node;

class DoubleList {

    Node head, tail; // 伪头结点和伪尾结点
    int size; // 链表的长度

    public DoubleList() { // 初始化
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.pre = head;
        size = 0;
    }

    public void addLast(Node x) { // 添加到链表尾部，且越靠近链表尾部，越代表最近使用过
        // 如当前链表为： head <-> 1 <-> tail，加入结点x = 2
        x.pre = tail.pre;
        x.next = tail; // 完成结点2指向两端的箭头  head <-> 1 <- 2 -> tail; 此时tail.pre = 结点1还未断开
        tail.pre.next = x;
        tail.pre = x; // 完成由结点2两端指向结点2的箭头  head <-> 1 <-> 2 <-> tail;
        size++; // 更新链表长度
    }

    public void remove(Node x) { // 删除指定结点（该结点一定存在与链表）
        x.pre.next = x.next;
        x.next.pre = x.pre;
        size--;
    }

    public Node removeHead() { // 删除并返回头结点
        if (head.next == tail) return null; // 说明是空链表
        Node first = head.next;
        remove(first); // size在remove中更新
        return first;  // 用作在哈希表中移除最久未使用的数据值
    }

    public int getSize() { // 获取链表长度
        return size;
    }

}
