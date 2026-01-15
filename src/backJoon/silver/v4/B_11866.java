package backJoon.silver.v4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int idx = 0; // 제거할 대상의 인덱스
        while (list.size() > 1) {
            // (현재 인덱스 + K - 1)을 현재 리스트 크기로 나눈 나머지가 다음 제거 위치입니다.
            idx = (idx + (k - 1)) % list.size();
            sb.append(list.remove(idx)).append(", ");
        }

        // 마지막 남은 요소 처리 (뒤에 쉼표 없이 ">"로 닫기)
        sb.append(list.remove(0)).append(">");
        System.out.println(sb.toString());
    }
}