package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/11365"/> 문제주소 </a>
 * 백준 / 11365 / !밀비 급일
 */
public class B11365 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        while (true) {
            sb = new StringBuilder();
            String str = br.readLine();

            if(str.equals("END")) break;
            else sb.append(str);

            System.out.println(sb.reverse());
        }
    }
}
