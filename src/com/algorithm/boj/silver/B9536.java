package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @see <a href="https://www.acmicpc.net/problem/9536"/> 문제주소 </a>
 * 백준 / 9536 / 여우는 어떻게 울지?
 */
public class B9536 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");

            List<String> list = new ArrayList<>(List.of(str));

            while (true) {
                String[] s = br.readLine().split(" ");

                if (s[1].equals("does")) break;
                else list.removeAll(Collections.singleton(s[2]));
            }

            for (String st : list)
                sb.append(st).append(" ");

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
