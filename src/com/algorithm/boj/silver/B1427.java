package com.algorithm.boj.silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/1427"/> 문제주소 </a>
 * 백준 / 1427 / 소트인사이드
 */
public class B1427 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(String.valueOf(str.charAt(i)));
        }

        Collections.sort(list, Collections.reverseOrder());

        for (String j : list) {
            System.out.print(j);
        }
    }
}
