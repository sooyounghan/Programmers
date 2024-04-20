class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String secret_phone_number = phone_number.substring(0, phone_number.length() - 4);
        secret_phone_number = secret_phone_number.replaceAll("[0-9]", "*");
        
        answer = secret_phone_number + phone_number.substring(phone_number.length() - 4);
        return answer;
    }
}