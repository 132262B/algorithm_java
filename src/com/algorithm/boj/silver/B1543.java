package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1543"/> 문제주소 </a>
 * BOJ / 1543 / 문서 검색
 */
public class B1543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String documentStr = br.readLine();
        String searchStr = br.readLine();

        int cnt = 0;
        int searchNum = 0;
        while (true) {

            if (documentStr.indexOf(searchStr, searchNum) == -1) {
                break;
            } else {
                searchNum = documentStr.indexOf(searchStr, searchNum) + searchStr.length();
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
