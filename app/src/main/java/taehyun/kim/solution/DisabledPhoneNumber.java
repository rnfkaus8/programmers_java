package taehyun.kim.solution;

public class DisabledPhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        final int DISABLED_PHONE_NUM_CNT = phone_number.length() - 4;
        answer = phone_number.substring(0, DISABLED_PHONE_NUM_CNT).replaceAll("[0-9]", "*") + phone_number.substring(DISABLED_PHONE_NUM_CNT);
        return answer;
    }
}
