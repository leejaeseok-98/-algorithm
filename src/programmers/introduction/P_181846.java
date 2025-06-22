package programmers.introduction;

public class P_181846 {
    public static void main(String[] args) {
        String a = "18446744073709551615";
        String b = "287346502836570928366";
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        System.out.println(sb.reverse().toString());
    }
}
