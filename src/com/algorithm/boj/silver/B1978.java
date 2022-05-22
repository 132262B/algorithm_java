package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1978"/> 문제주소 </a>
 * BOJ / 1978 / 소수 찾기
 */
public class B1978 {

    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<n; i++) {
            sosu(Integer.parseInt(st.nextToken()));
        }

        System.out.println(count);
    }

    public static void sosu(int num) {

        if(num < 2) return;
        if(num == 2) {
            count++;
            return;
        }

        for(int j=2; j<num; j++)
            if(num % j ==0) return;

        count++;
    }

}
