package LinkedList;

import java.util.List;

import org.w3c.dom.Node;

public class intersectioninll {
    public static class ListNode {
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

    public static ListNode insertNode(ListNode head, int val) {

        ListNode newnode = new ListNode(val);
        if (head == null) {
            head = newnode;
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
        // brute force approach---------
    }
    // static ListNode intersectionPresent(ListNode head1, ListNode head2) {
    // while (head2 != null) {
    // ListNode temp = head1;
    // while (temp != null) {

    // if (temp == head2)
    // return head2;
    // temp = temp.next;
    // }
    // head2 = head2.next;
    // }

    // return null;
    // }

    // optimised approach-----------
    static ListNode intersectionPresent(ListNode head1, ListNode head2) {
        ListNode d1 = head1;
        ListNode d2 = head2;

        while (d1 != d2) {
            d1 = d1 == null ? head2 : d1.next;
            d2 = d2 == null ? head1 : d2.next;
        }

        return d1;
    }

    public static void main(String[] args) {
        ListNode head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 3);
        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 4);
        ListNode head1 = head;
        head = head.next.next.next;
        ListNode headSec = null;
        headSec = insertNode(headSec, 3);
        ListNode head2 = headSec;
        headSec.next = head;

    }

}