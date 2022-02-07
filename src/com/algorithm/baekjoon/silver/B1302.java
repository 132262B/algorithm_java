package com.algorithm.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @see <a href="https://www.acmicpc.net/problem/1302"/> 문제주소 </a>
 * 백준 / 1302 / 베스트셀러
 */
public class B1302 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (map.containsKey(str)) {
                int num = map.get(str);
                map.put(str, num + 1);
            } else {
                map.put(str, 1);
            }
        }

        int max = 0;
        for (String ma : map.keySet()) {
            max = Math.max(max, map.get(ma));
        }

        ArrayList<String> list = new ArrayList(map.keySet());
        Collections.sort(list);

        for (String str : list) {
            if (map.get(str) == max) {
                System.out.println(str);
                break;
            }

        }

    }
}
