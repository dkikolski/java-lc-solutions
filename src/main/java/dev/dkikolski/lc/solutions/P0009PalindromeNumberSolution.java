package dev.dkikolski.lc.solutions;

import dev.dkikolski.lc.tags.Easy;

@Easy
final class P0009PalindromeNumberSolution {

    private P0009PalindromeNumberSolution(){}

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x /= 10;
        }

        return x == y || x == y / 10;
    }
}
