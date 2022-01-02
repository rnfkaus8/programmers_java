package taehyun.kim.solution;

public class HasshadNumber {
    public boolean solution(int x){
        int sumOfDigit = 0;
        int originNumber = x;
        while(x > 0){
            sumOfDigit += x % 10;
            x = x / 10;
        }
        return originNumber % sumOfDigit == 0;
    }
}
