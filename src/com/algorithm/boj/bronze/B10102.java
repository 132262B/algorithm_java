package com.algorithm.boj.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10102"/> 문제주소 </a>
 * 백준 / 10102 / 개표
 */
public class B10102 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = 0;
        int b = 0;
        for(int i=0; i<n; i++) {
            if(str.charAt(i) =='A') a++;
            else b++;
        }

        if(a==b) System.out.println("Tie");
        else if(a>b) System.out.println("A");
        else System.out.println("B");

    }
}
