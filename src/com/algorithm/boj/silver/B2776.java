package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @see <a href="https://www.acmicpc.net/problem/2776"/> 문제주소 </a>
 * 백준 / 2776 / 암기왕
 */
public class B2776 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {

            int m = Integer.parseInt(br.readLine());
            String[] note1 = br.readLine().split(" ");

            HashMap<String, String> map = new HashMap<>();

            for (String value : note1) {
                map.put(value, value);
            }

            m = Integer.parseInt(br.readLine());
            String[] note2 = br.readLine().split(" ");
            for (String s : note2) {
                if (map.containsKey(s)) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }

        }

        System.out.println(sb);
    }
}
