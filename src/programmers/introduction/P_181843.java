package programmers.introduction;

public class P_181843 {
    public static void main(String[] args) {
        Sol5 sol5 = new Sol5();
        String my_string = "banana";
        String target = "ana";
        System.out.println(sol5.solution(my_string, target));
    }
}
class Sol5{
    public int solution(String my_string,String target){
        if (my_string.contains(target)){
            return 1;
        }
        else {
            return 0;
        }
    }
}