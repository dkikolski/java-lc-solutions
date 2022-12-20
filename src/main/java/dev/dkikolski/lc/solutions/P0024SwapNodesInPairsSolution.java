package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.structures.ListNode;
import dev.dkikolski.lc.tags.Medium;

@Medium
final class P0024SwapNodesInPairsSolution {

    private P0024SwapNodesInPairsSolution() {
    }

    public static ListNode swapPairs(final ListNode head) {
        final ListNode fakeHead = new ListNode( 0, head);
        ListNode prev = fakeHead;
        ListNode current = head;
        boolean shouldSwap = true;

        while (current != null && current.next != null) {
            if (shouldSwap) {
                final var nextNext = current.next.next;
                final var temp = current;
                current = current.next;
                current.next = temp;
                temp.next = nextNext;
                prev.next = current;
            }
            shouldSwap = !shouldSwap;
            prev = current;
            current = current.next;
        }

        return fakeHead.next;
    }
}
