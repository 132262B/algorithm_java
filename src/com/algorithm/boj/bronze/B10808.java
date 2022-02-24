package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10808"/> 문제주소 </a>
 * 백준 / 10808 / 알파벳 개수
 */
public class B10808 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++)
            arr[str.charAt(i) - 97]++;

        for (int n : arr)
            sb.append(n).append(" ");

        System.out.println(sb);
    }
}
