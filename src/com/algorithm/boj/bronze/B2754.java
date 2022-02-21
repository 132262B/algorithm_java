package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2754"/> 문제주소 </a>
 * 백준 / 2754 / 학점계산
 */
public class B2754 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        float d = 0.0f;

        if (str.charAt(0) == 'A') d = 4.0f + fl(str.charAt(1));
        else if (str.charAt(0) == 'B') d = 3.0f + fl(str.charAt(1));
        else if (str.charAt(0) == 'C') d = 2.0f + fl(str.charAt(1));
        else if (str.charAt(0) == 'D') d = 1.0f + fl(str.charAt(1));

        System.out.println(d);
    }

    public static float fl(char c) {
        float i = 0f;
        if (c == '+') i += 0.3f;
        else if (c == '-') i -= 0.3f;
        return i;
    }

}