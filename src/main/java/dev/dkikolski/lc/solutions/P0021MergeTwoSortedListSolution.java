package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.structures.ListNode;
import dev.dkikolski.lc.tags.Easy;
import dev.dkikolski.lc.tags.LinkedList;

@Easy
@LinkedList
final class P0021MergeTwoSortedListSolution {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var a = list1;
        var b = list2;
        var result = new ListNode();
        var resultDummyHead = result;

        while (a != null || b != null) {
            if ((a != null && b!= null && a.val < b.val) || b == null) {
                result.next = a;
                a = a.next;
            } else {
                result.next = b;
                b = b.next;
            }
            result = result.next;
        }

        return resultDummyHead.next;
    }
}
