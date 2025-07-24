package backJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double totalSubject = 0.0;
        Double totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," " );
            String subject = st.nextToken();
            Double credit = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            if (!score.equals("P")) {
                Double scoreDouble = gradeConversion(score);
                totalSubject += credit * scoreDouble;
                totalCredit += credit;
            }

        }
        System.out.printf("%.6f\n",totalSubject / totalCredit);
    }
    public static Double gradeConversion(String grade) {
        if (grade.equals("A+")) {
            return  4.5;
        } else if (grade.equals("A0")) {
            return  4.0;
        } else if (grade.equals("B+")) {
            return  3.5;
        }else if (grade.equals("B0")) {
            return  3.0;
        }else if (grade.equals("C+")) {
            return  2.5;
        }else if (grade.equals("C0")) {
            return  2.0;
        }else if (grade.equals("D+")) {
            return  1.5;
        }else if (grade.equals("D0")) {
            return  1.0;
        }else if (grade.equals("F")) {
            return  0.0;
        } else {
            return  -1.0;
        }
    }
}
