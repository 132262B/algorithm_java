package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://www.acmicpc.net/problem/2751"/> 문제주소 </a>
 * 백준 / 2751 / 수 정렬하기 2
 */
public class B2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i + "\n");
        }

        System.out.println(sb);

    }
}
