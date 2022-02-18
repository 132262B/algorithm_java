package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/9086"/> 문제주소 </a>
 * 백준 / 9086 / 문자열
 */
public class B9086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++) {
            String str = br.readLine();

            sb.append(str.charAt(0)).append(str.charAt(str.length()-1)).append("\n");
        }

        System.out.println(sb);
    }
}
