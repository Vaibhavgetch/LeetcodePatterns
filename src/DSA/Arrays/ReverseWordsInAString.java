package DSA.Arrays;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        ReverseWordsInAString obj = new ReverseWordsInAString();
        String words1 = obj.reverseWords1("the sky is blue");
        String words2 = obj.reverseWords2("a good   example");
        System.out.println(words2);
    }

    private String reverseWords2(String s) {
        int i = s.length() - 1;
        StringBuilder ans = new StringBuilder();
        // We are iterating in reverse order
        while (i >= 0) {
            // Iterate till empty spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            // set pointer at last letter of the word
            int j = i;

            //If string is fully traversed
            if (i < 0) break;

            // Iterate till no spaces are found or till we get alphabets
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            // append the substring to ans
            ans.append(s, i + 1, j + 1).append(" ");
        }
        return ans.toString().trim();
    }

    /*
     *  With extra space
     * */
    public String reverseWords1(String s) {
        String[] words = s.trim().split("\s+");

        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]).append(" ");
        }

        return ans.toString().trim();
    }
}

