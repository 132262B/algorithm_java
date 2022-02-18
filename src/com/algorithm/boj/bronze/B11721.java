package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/11721"/> 문제주소 </a>
 * 백준 / 11721 / 열 개씩 끊어 출력하기
 */
public class B11721 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int cnt = 0;
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i));
            cnt++;
            if(cnt == 10) {
                System.out.println();
                cnt = 0;
            }
        }
    }
}
