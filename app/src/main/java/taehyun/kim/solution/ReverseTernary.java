package taehyun.kim.solution;

public class ReverseTernary {
    /**
     * 문제 : 3진법 뒤집기
     * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
     * @param n
     * @return
     */
    public int solution(int n){
        int answer = 0;
        final int RADIX = 3;
        StringBuilder stringBuilder = new StringBuilder();
        while(n > 0){
            stringBuilder.append(n % RADIX);
            n = n / RADIX;
        }
        return Integer.parseInt(stringBuilder.toString(), RADIX);
    }
}
