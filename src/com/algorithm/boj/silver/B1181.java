package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/1181"/> 문제주소 </a>
 * 백준 / 1181 / 단어 정렬
 */
public class B1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] str = new String[num];

        for (int i = 0; i < num; i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str, (o1, o2) -> {
            if(o1.length() == o2.length())
                return o1.compareTo(o2);

            return o1.length() - o2.length();
        });

        System.out.println(str[0]);
        for (int i = 1; i < num; i++) {
            if(!str[i].equals(str[i-1]))
                System.out.println(str[i]);
        }

    }
}
