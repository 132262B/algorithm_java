package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2693"/> 문제주소 </a>
 * 백준 / 2693 / N번째 큰 수
 */
public class B2693 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        while (count != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] num = new int[st.countTokens()];

            for(int i=0; i<num.length; i++) {
                num[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(num);
            System.out.println(num[num.length-3]);
            count--;
        }


    }
}
