package com.algorithm.boj.bronze;

import java.time.LocalDate;

/**
 * @see <a href="https://www.acmicpc.net/problem/10699"/> 문제주소 </a>
 * 백준 / 10699 / 오늘 날짜
 */
public class B10699 {

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // System.out.println 으로 날짜를 바로 적어도 통과됨.
        // 이렇게 LocalDate 같은 pc에 시간을 알아내는 class를 사용하면 제출하는 시간에 따라 체점이 다르게 될 수 있음.
    }
}
