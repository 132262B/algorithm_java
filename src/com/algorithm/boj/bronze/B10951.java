package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10951"/> 문제주소 </a>
 * BOJ / 10951 / A+B - 4
 */
public class B10951 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String[] str = br.readLine().split(" ");
                System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));

            }
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }
}