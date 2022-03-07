package com.algorithm.boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @see <a href="https://www.acmicpc.net/problem/16165"/> 문제주소 </a>
 * BOJ / 16165 / 걸그룹 마스터 준석이
 */
public class B16165 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        // 시작
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String group = br.readLine();
            int memberSu = Integer.parseInt(br.readLine());
            List<String> member = new ArrayList<>();
            for (int j = 0; j < memberSu; j++) {
                String name = br.readLine();
                member.add(name);
            }

            Collections.sort(member);
            map.put(group, member);
        }
        // 까지 그룹에 맴버 추가
        for (int k = 0; k < m; k++) {
            String result = br.readLine();
            int nm = Integer.parseInt(br.readLine());

            if (nm == 0) {
                for (String list : map.get(result)) {
                    sb.append(list).append("\n");
                }
            } else {
                for (String nmap : map.keySet()) {
                    if (map.get(nmap).contains(result)) {
                        sb.append(nmap).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
