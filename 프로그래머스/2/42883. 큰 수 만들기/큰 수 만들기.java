class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int n = number.length();
        int resultLen = n - k; // 최종 결과 길이
        
        int start = 0;
        for (int i = 0; i < resultLen; i++) {
            // start ~ (현재 인덱스 기준으로 k개 제거 가능한 범위) 내 최댓값
            int maxIdx = start;
            int end = start + k - sb.length() + i + 1; 
            // 실제로 선택 가능한 범위: start ~ (n - resultLen + i)
            int limit = n - resultLen + i;
            
            for (int j = start + 1; j <= limit; j++) {
                if (number.charAt(j) > number.charAt(maxIdx)) {
                    maxIdx = j;
                }
            }
            sb.append(number.charAt(maxIdx));
            k -= (maxIdx - start); // maxIdx - start 개 제거
            start = maxIdx + 1;
        }
        
        return sb.toString();
    }
}