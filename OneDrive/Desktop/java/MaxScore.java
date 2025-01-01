public class MaxScore {

    public static void main(String[] args) {
        MaxScore obj=new MaxScore();
        int a = obj.maxScore("00011111");
        System.out.print(a);
    }
    public int maxScore(String s) {
        int add,max=0,count_one=0,count_zero=0;
        for(int i=1;i<s.length();i++){
          if(s.charAt(i)=='1'){
              count_one++;
          }
        }
        if(s.charAt(0)=='0'){
          count_zero++;
        }
        max=count_one+count_zero;
        for(int i=1;i<s.length()-1;i++){
          if(s.charAt(i)=='0'){
              count_zero++;
          }else{
              count_one--;
          }
          add=count_zero+count_one;
          if(add>max){
              max=add;
          }
        }
        return max;
      }
}

//Question
//1422. Maximum Score After Splitting a String

// Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

// The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.
// Example 1:

// Input: s = "011101"
// Output: 5 
// Explanation: 
// All possible ways of splitting s into two non-empty substrings are:
// left = "0" and right = "11101", score = 1 + 4 = 5 
// left = "01" and right = "1101", score = 1 + 3 = 4 
// left = "011" and right = "101", score = 1 + 2 = 3 
// left = "0111" and right = "01", score = 1 + 1 = 2 
// left = "01110" and right = "1", score = 2 + 1 = 3