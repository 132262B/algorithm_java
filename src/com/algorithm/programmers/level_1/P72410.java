package com.algorithm.programmers.level_1;

/**
 * @see <a href="https://programmers.co.kr/learn/courses/30/lessons/72410"/> 문제주소 </a>
 * 프로그래머스 / 2021 KAKAO BLIND RECRUITMENT > 신규 아이디 추천
 * <p>
 * 정규 표현식 사용 이해도가 조금 더 높아짐.
 */
public class P72410 {

    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
    }

    public static String solution(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z\\d._-]", "").replaceAll("\\.+", ".").replaceAll("^\\.", "").replaceAll("\\.$", "");

        StringBuffer id = new StringBuffer(new_id);

        if (id.length() == 0) id.append("a");
        if (id.length() >= 16) id.delete(15, id.length());

        new_id = id.toString();
        new_id = new_id.replaceAll("\\.$", "");

        while (new_id.length() < 3) {
            String a = new_id.substring(new_id.length() - 1);
            new_id += a;
        }

        return new_id;
    }
}