package dev.dkikolski.lc.aux;

import dev.dkikolski.lc.structures.ListNode;


@SuppressWarnings("SpellCheckingInspection")
public class ListNodes {

    private ListNodes(){}

    public static ListNode makeLinkedList(int... ints) {
        final var dummyHead = new ListNode();
        var tail = dummyHead;
        for (int i : ints) {
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        return dummyHead.next;
    }

    public static void printLinkedList(ListNode head) {
        final var sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append(" -> ");
            }
            head = head.next;
        }
        System.out.println(sb);
    }

    public static int compareLinkedListNodes(final ListNode a, final ListNode b) {
        var acurrent = a;
        var bcurrent = b;
        while (acurrent != null || bcurrent != null) {
            if (acurrent == null) {
                return 1;
            }
            if (bcurrent == null) {
                return -1;
            }
            if (acurrent.val != bcurrent.val) {
                return acurrent.val - bcurrent.val;
            }
            acurrent = acurrent.next;
            bcurrent = bcurrent.next;
        }
        return 0;
    }
}
