package kr.or.ddit.MyStudy.Practice.programmers;

//숨어있는 숫자의 덧셈

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i); // my_string의 첫 단어부터 마지막 단어까지
                                          //  ch에 보관하세요
            if(ch>='0' && ch<='9') {  // ch가 0보다 크거나 같고, 9보다 작거나 같을 경우,
                                      // answer에 
                answer +=ch-'0';
            }
        }
        System.out.println();
        return answer;
    }
}
