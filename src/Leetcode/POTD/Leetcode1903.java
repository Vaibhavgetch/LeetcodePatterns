package Leetcode.POTD;

public class Leetcode1903 {
    public static void main(String[] args) {
        String  str = "35427";
        String largestOddNumber = largestOddNumber(str);
        System.out.println(largestOddNumber);
    }


    public static String largestOddNumber(String num) {

        StringBuilder sb = new StringBuilder();

        for(int i = num.length() - 1; i >= 0 ; i--){
            int digit = num.charAt(i) - '0';

            if(digit % 2 != 0){
                sb.append(num, 0, i + 1);
                break ;
            }

        }
        return sb.toString() ;
    }

}
