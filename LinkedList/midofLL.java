package LinkedList;

import org.w3c.dom.Node;

public class midofLL {
    // ListNode head;

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;

        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    // brute force approach
    // public static ListNode middleNode(ListNode head) {
    // int size = 0;
    // ListNode temp = head;
    // while (temp != null) {
    // temp = temp.next;
    // size++;
    // }
    // if (size % 2 == 0) {
    // size = (size / 2) + 1;
    // } else {
    // size = Math.round((float) size / 2);
    // }
    // ListNode tem2 = head;
    // int count = 1;
    // while (count != size) {
    // count++;
    // tem2 = tem2.next;
    // }
    // return tem2;

    // }

    // optimal approach - Tortoise and Hare algorithm
    static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Find the middle node
        ListNode middleNodex = findMiddle(head);

        // Display the value of the middle node
        System.out.println("The middle node value is: " + middleNodex.val);

    }

}
