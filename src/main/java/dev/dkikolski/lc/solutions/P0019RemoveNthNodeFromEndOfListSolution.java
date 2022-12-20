package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.structures.ListNode;
import dev.dkikolski.lc.tags.LinkedList;
import dev.dkikolski.lc.tags.Medium;

@Medium
@LinkedList
public class P0019RemoveNthNodeFromEndOfListSolution {

    public static ListNode removeNthFromEnd(final ListNode head, final int n) {
        var size = 0;
        var currentNode = head;
        while(currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }

        var dummyHead = new ListNode(0, head);
        currentNode = head;
        ListNode prev = dummyHead;
        var currentIndex = 0;
        while(currentNode != null) {
            if (currentIndex == size - n) {
                prev.next = currentNode.next;
                return dummyHead.next;
            }
            currentIndex++;
            prev = currentNode;
            currentNode = currentNode.next;
        }
        return dummyHead.next;
    }
}
