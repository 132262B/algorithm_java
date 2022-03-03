package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/13163"/> 문제주소 </a>
 * 백준 / 13163 / 닉네임에 갓 붙이기
 */
public class B13163 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            sb.append("god");
            for (int j = 1; j < arr.length; j++)
                sb.append(arr[j]);
            sb.append("\n");

        }

        System.out.println(sb);
    }
}
