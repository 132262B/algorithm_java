package com.algorithm.boj.bronze;


/**
 * @see <a href="https://www.acmicpc.net/problem/15596"/> 문제주소 </a>
 * 백준 / 15596 / 정수 N개의 합
 */
public class B15596 {
    // class 이름은 Test 로 제출해야합니다.

    public long sum(int[] a) {
        long sum = 0L;
        for (int j : a) sum += j;

        return sum;
    }
}
