package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/1417"/> 문제주소 </a>
 * BOJ / 1417 / 국회의원 선거
 */
public class B1417 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n==1) {
            System.out.println("0");
            return;
        }

        int[] arr = new int[n-1];

        int dasum = Integer.parseInt(br.readLine());
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        while (true) {
            Arrays.sort(arr);
            if(dasum > arr[arr.length-1]) break;

            arr[arr.length-1]--;
            count++;
            dasum++;

        }

        System.out.println(count);

    }
}
