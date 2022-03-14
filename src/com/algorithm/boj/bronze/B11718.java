package com.algorithm.boj.bronze;

import java.io.IOException;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/11718"/> 문제주소 </a>
 * BOJ / 11718 / 그대로 출력하기
 *
 * 그대로 출력하기 2랑 동일...
 */
public class B11718 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
