package accept;

/**
 * @author chengyongjun
 * @date 2017/9/20
 * @time 16:27
 * @description
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 */
public class Number5 {

    public String longestPalindrome(String s) {

        if (s==null){
            return null;
        }

        if (s.length()==1){
            return s;
        }

        if (s.length()==2){
            if (s.charAt(0)==s.charAt(1)){
                return s;
            }
            else {
                return null;
            }
        }

         int i=0;
         int j=s.length()-i;
         while (i<j){
             if (s.charAt(i)==s.charAt(j)){
                 continue;
             }else {

             }
         }

        return null;


    }
}
