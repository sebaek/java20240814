package leetcode.p1700;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int countStudents(int[] num1, int[] num2) {

        Queue<Integer> students = new LinkedList<>();
        Queue<Integer> sandwiches = new LinkedList<>();

        for (int n : num1) {
            students.offer(n);
        }
        for (int n : num2) {
            sandwiches.offer(n);
        }

        
        return 0;
    }
}
