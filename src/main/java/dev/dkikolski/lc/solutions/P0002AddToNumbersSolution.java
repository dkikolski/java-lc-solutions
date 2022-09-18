package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.structures.ListNode;
import dev.dkikolski.lc.tags.Easy;
import dev.dkikolski.lc.tags.Medium;

@Medium
final class P0002AddToNumbersSolution {

    private P0002AddToNumbersSolution(){}

    @SuppressWarnings("SpellCheckingInspection")
    public static ListNode addTwoNumbers(ListNode a, ListNode b) {
        var dummyHead = new ListNode();
        var tail = dummyHead;
        var acurrent = a;
        var bcurrent = b;
        var reminder = 0;

        while (acurrent != null || bcurrent != null) {
            final var aval = acurrent != null ? acurrent.val : 0;
            final var bval = bcurrent != null ? bcurrent.val : 0;
            final var sum = aval + bval + reminder;

            reminder = sum / 10;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            acurrent = acurrent != null ? acurrent.next : null;
            bcurrent = bcurrent != null ? bcurrent.next : null;
        }
        if (reminder != 0) {
            tail.next = new ListNode(reminder);
        }
        return dummyHead.next;
    }
}
