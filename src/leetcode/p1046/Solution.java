package leetcode.p1046;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int lastStoneWeight(int[] stones) {
        // int[] -> List<Integer>
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

        // 가장 큰 돌 두개 찾아서 부딪혀 깨고 남은 거 다시 리스트에 넣기


        // 리스트에 하나의 돌이 남을 때까지

        //      가장 큰 돌 두개 찾기
        //          1. sort
        //          2. 오른쪽 두개

        //      큰 돌 두개 꺼내기(지우기)
        //      두 돌의 무게가 0이 아니면 차이(무게) 돌 다시 넣기
        //


        // 하나 남은 돌의 무게 리턴
        return 0;
    }
}
