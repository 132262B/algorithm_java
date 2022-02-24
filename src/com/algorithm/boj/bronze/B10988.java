package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10988"/> 문제주소 </a>
 * 백준 / 10988 / 팰린드롬인지 확인하기
 */
public class B10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        sb.append(str);
        System.out.println((sb.reverse().toString().equals(str)) ? 1 : 0);
    }
}