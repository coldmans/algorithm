import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
// 이딴게 브론즈 2 문제라고?
    static class KMPCore{
        int [] getLPS(String p){
            int m = p.length();
            int [] lps = new int[m];
            int len = 0, i = 1;

            while(i < m){
                if(p.charAt(i) == p.charAt(len)){
                    lps[i++] = ++len;
                } else if (len != 0){
                    len = lps[len - 1];
                } else{
                    lps[i++] = 0;
                }
            }
            return lps;
        }

    boolean search(String text, String pattern) {
        if (pattern.length() == 0) return true;
        if (text.length() < pattern.length()) return false;

        int n = text.length(), m = pattern.length();
        int[] lps = getLPS(pattern);
        int i = 0, j = 0;

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                return true;  // 찾았으니까 바로 리턴 ㅇㅇ
            } else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return false;  // 못찾음 ㅅㅂ
    }
}


    

    static String removeDigits(String s) {
        char[] chars = s.toCharArray();
        int j = 0;

        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                chars[j++] = chars[i];
            }
        }

        return new String(chars, 0, j);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String K = br.readLine();
        // KMPCore 인스턴스 생성
        KMPCore kmp = new KMPCore();
        String cleaned = removeDigits(S);
        System.out.println(kmp.search(cleaned, K) ? 1 : 0);
        br.close();
    }
}
