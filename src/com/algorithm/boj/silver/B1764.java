package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1764"/> 문제주소 </a>
 * 백준 / 1764 / 듣보잡
 */
public class B1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> map_n = new HashMap<>();
        HashMap<String, String> map_m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map_n.put(str, str);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (map_n.containsKey(str)) {
                map_m.put(str, str);
            }
        }

        ArrayList<String> list = new ArrayList<>(map_m.keySet());
        Collections.sort(list);

        sb.append(list.size()).append("\n");

        for (String str : list) {
            sb.append(str).append("\n");
        }

        System.out.println(sb);
    }
}
