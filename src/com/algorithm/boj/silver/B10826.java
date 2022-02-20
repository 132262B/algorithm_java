package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @see <a href="https://www.acmicpc.net/problem/10826"/> 문제주소 </a>
 * 백준 / 10826 / 피보나치 수 4
 */
public class B10826 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) + 1;
        BigInteger[] biarr = new BigInteger[n];

        biarr[0] = BigInteger.valueOf(0);

        if (n > 1)
            biarr[1] = BigInteger.valueOf(1);

        for (int i = 2; i < n; i++) {
            biarr[i] = biarr[i - 1].add(biarr[i - 2]);
        }

        System.out.println(biarr[n - 1]);

    }
}