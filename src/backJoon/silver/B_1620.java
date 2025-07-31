package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());//등록 단어 수
        int m = Integer.parseInt(st.nextToken());//시험 단어 수

//        데이터입력
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            map1.put(name, i);
            map2.put(i, name);
        }

//        검증
        for (int i = 1; i <= m; i++) {
            String s = br.readLine();
            if ( 49 <= s.charAt(0) && s.charAt(0) <= 57){
                sb.append(map2.get(Integer.parseInt(s)));
            }else {
                sb.append(map1.get(s));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
