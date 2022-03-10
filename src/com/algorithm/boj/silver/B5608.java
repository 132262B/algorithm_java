package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @see <a href="https://www.acmicpc.net/problem/5608"/> 문제주소 </a>
 * BOJ / 5608 / 問題 ２
 */
public class B5608 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<>();
        while (n-- > 0) {
            String[] str = br.readLine().split(" ");
            map.put(str[0], str[1]);
        }

        int m = Integer.parseInt(br.readLine());
        while (m-- > 0) {
            String str = br.readLine();
            if (map.containsKey(str))
                sb.append(map.get(str));
            else
                sb.append(str);
        }

        System.out.println(sb);
    }
}
