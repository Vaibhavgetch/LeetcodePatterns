package Arrays;

/*
* LeetCode : 415
* */
public class AddStrings {

    public static void main(String[] args) {

        AddStrings addStrings = new AddStrings();
        String s = addStrings.addStrings("11", "27");
        System.out.println(s);
    }

    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0 ;
        int sum ;

        while(i >= 0|| j >= 0 || carry > 0){
            int digit1 = (i >= 0)? num1.charAt(i--) - '0' : 0 ;
            int digit2 = (j >= 0)? num2.charAt(j--) - '0' : 0 ;

            sum = digit1 + digit2 + carry ;
            carry = sum/10 ;
            str.append(sum % 10);
        }
        return str.reverse().toString();
    }

}
