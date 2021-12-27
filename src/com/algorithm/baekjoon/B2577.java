package com.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2577"/> 문제주소 </a>
 * 백준 / 2577 / 숫자의 개수
 *
 */
public class B2577 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = (Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));

        int[] arr = new int[10];
        String num = String.valueOf(i);

        for (int j = 0; j < num.length(); j++)
            arr[num.charAt(j) - 48]++;

        for (int k : arr)
            System.out.println(k);

    }
}
