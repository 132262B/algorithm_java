package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1063"/> 문제주소 </a>
 * BOJ / 1063 / 킹
 */
public class B1063 {

    static String king = "";
    static String dol = "";
    static int num = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        king = str[0];
        dol = str[1];
        num = Integer.parseInt(str[2]);

        for (int i = 0; i < num; i++) {

            String input = br.readLine();

            String nextKing = move(king, input);
            String nextDol = move(dol, input);
            if (nextKing.equals(nextDol)) {
                continue;
            }

            king = move(king, input);

            if (king.equals(dol)) {
                dol = move(dol, input);
            }
        }

        System.out.println(king);
        System.out.println(dol);

    }

    public static String move(String location, String input) {
        char ch = location.charAt(0);
        int n = Integer.parseInt(String.valueOf(location.charAt(1)));

        switch (input) {
            case "R": { // 한 칸 오른쪽으로
                if (ch != 'H') ch++;
                break;
            }
            case "L": { // 한 칸 왼쪽으로
                if (ch != 'A') ch--;
                break;
            }
            case "B": { // 한 칸 아래로
                if (n != 1) n--;
                break;
            }
            case "T": { // 한 칸 위로
                if (n != 8) n++;
                break;
            }
            case "RT": { // 오른쪽 위 대각선으로
                if (ch != 'H' && n != 8) {
                    ch++;
                    n++;
                }
                break;
            }
            case "LT": { // 왼쪽 위 대각선으로
                if (ch != 'A' && n != 8) {
                    ch--;
                    n++;
                }
                break;
            }
            case "RB": { // 오른쪽 아래 대각선으로
                if (ch != 'H' && n != 1) {
                    ch++;
                    n--;
                }
                break;
            }
            case "LB": { // 왼쪽 아래 대각선으로
                if (ch != 'A' && n != 1) {
                    ch--;
                    n--;
                }
                break;
            }
        }

        return String.valueOf(ch) + n;
    }


}