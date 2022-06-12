package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://www.acmicpc.net/problem/17254"/> 문제주소 </a>
 * BOJ / 17254 / 키보드 이벤트
 */
public class B17254 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int m = Integer.parseInt(str[1]);

        List<String> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            list.add(br.readLine());
        }

        Collections.sort(list, (o1, o2) -> {
            String[] o1_arr = o1.split(" ");
            String[] o2_arr = o2.split(" ");


            if (Integer.parseInt(o1_arr[1]) != Integer.parseInt(o2_arr[1])) {
                return Integer.parseInt(o1_arr[1]) - Integer.parseInt(o2_arr[1]);
            } else {
                return Integer.parseInt(o1_arr[0]) - Integer.parseInt(o2_arr[0]);
            }
        });

        for (String li : list) {
            System.out.print(li.split(" ")[2]);
        }

    }
}
