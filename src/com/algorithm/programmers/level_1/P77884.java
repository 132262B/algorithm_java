package com.algorithm.programmers.level_1;

/**
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/77884"/> 문제주소 </a>
 * 월간 코드 챌린지 시즌2 > 약수의 개수와 덧셈
 */
public class P77884 {

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= right; j++) if (i % j == 0) count++;
            answer = (count % 2 == 0) ? answer + i : answer - i;
            count = 0;
        }
        return answer;
    }
}