package com.algorithm.boj.silver;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/17219"/> 문제주소 </a>
 * 백준 / 17219 / 비밀번호 찾기
 */
public class B17219 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int p = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        HashMap<String, String> psList = new HashMap<>();
        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            psList.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < s; i++) {
            bw.write(psList.get(br.readLine()));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
