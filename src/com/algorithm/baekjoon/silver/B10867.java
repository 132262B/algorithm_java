package com.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/10867"/> 문제주소 </a>
 * 백준 / 10867 / 중복 빼고 정렬하기
 */
public class B10867 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        Set<String> set = new HashSet<>(List.of(arr));


        List<Integer> list = new ArrayList<>();
        for (String str : set)
            list.add(Integer.parseInt(str));

        Collections.sort(list);

        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}
