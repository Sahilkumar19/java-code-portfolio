package com.simplestcodings;

import java.util.Stack;

public class TwoStacks {
    public static void main(String[] args) {
        int max = 10;
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        first.push(1);
        first.push(2);
        first.push(5);
        first.push(0);
        first.push(6);
        second.push(3);
        second.push(1);
        second.push(5);
        second.push(2);

        int result = helper(max, first, second, 0, 0);
        System.out.println("Maximum count: " + result);
    }

    public static int helper(int max, Stack<Integer> s1, Stack<Integer> s2, int sum, int count) {
        return max_count(max, s1, s2, sum, count);
    }

    public static int max_count(int max, Stack<Integer> s1, Stack<Integer> s2, int sum, int count) {
        // Base case: if sum exceeds max, return the count
        if (sum > max) {
            return count - 1;  // subtract 1 to exclude the last added element
        }

        // Base case: if both stacks are empty, return the count
        if (s1.isEmpty() && s2.isEmpty()) {
            return count;
        }

        // Track the maximum counts from both stacks
        int l = count;
        int r = count;

        // Option 1: Take an element from s1
        if (!s1.isEmpty()) {
            int top1 = s1.pop();
            l = max_count(max, s1, s2, sum + top1, count + 1);
            s1.push(top1); // Put the element back for other recursive calls
        }

        // Option 2: Take an element from s2
        if (!s2.isEmpty()) {
            int top2 = s2.pop();
            r = max_count(max, s1, s2, sum + top2, count + 1);
            s2.push(top2); // Put the element back for other recursive calls
        }

        return Math.max(l, r);
    }
}

