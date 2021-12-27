package com.algorithm.programmers.level_1;

/**
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/82612"/> 문제주소 </a>
 * 부족한 금액 계산하기
 */
public class P82612 {

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
        long result = price * ((long) count * (1 + count) / 2);
        return (result <= money) ? 0 : result - (long) money;
    }

}
