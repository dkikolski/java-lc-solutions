package dev.dkikolski.lc.structures;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        final var follower = next == null ? "null" : next.toString();
        return val + "::" + follower;
    }
}
