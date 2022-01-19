package com.algorithm.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/10817"/> 문제주소 </a>
 * 백준 / 10817 / 세 수
 */
public class B10817 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        for(int i=0; i<3; i++)
            nums[i] = sc.nextInt();

        sc.close();
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
