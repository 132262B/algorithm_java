package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @see <a href="https://www.acmicpc.net/problem/16165"/> 문제주소 </a>
 * BOJ / 20291 / 파일 정리
 */
public class B20291 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            String sstr = br.readLine();
            String str = sstr.substring(sstr.lastIndexOf(".") + 1);

            if (map.containsKey(str)) map.put(str, map.get(str) + 1);
            else map.put(str, 1);
        }

        String[] arr = map.keySet().toArray(new String[0]);
        Arrays.sort(arr);

        for (String earr : arr)
            sb.append(earr).append(" ").append(map.get(earr)).append("\n");

        System.out.println(sb);

    }
}
