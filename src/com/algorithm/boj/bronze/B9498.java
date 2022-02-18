package com.algorithm.boj.bronze;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/9498"/> 문제주소 </a>
 * 백준 / 9498 / 시험성적
 */
public class B9498 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        String result;
        if(score < 60) result = "F";
        else if(score < 70) result = "D";
        else if(score < 80) result = "C";
        else if(score < 90) result = "B";
        else result = "A";

        System.out.println(result);
    }
}