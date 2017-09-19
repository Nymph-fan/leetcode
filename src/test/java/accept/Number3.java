package accept;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengyongjun
 * @date 2017/9/19
 * @time 11:38
 * @description
 * Given "abcabcbb", the answer is "abc", which the length is 3.
   Given "bbbbb", the answer is "b", with the length of 1.
 */
public class Number3 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        // 当前处理的开始位置
        int start = 0;
        // 记录到的最大非重复子串长度
        int result = 0;
        // 访问标记，记录最新一次访问的字符和位置
        Map<Character, Integer> map = new HashMap<Character, Integer>(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 如果字符已经出现过(在标记开位置算起)，就重新标记start
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }
            // 如果没有出现过就求最大的非重复子串的长度
            else {
                result = Math.max(result, i - start + 1);
            }

            // 更新访问记录
            map.put(ch, i);
        }
        return result;


    }


    @Test
    public void Solution(){
        String s1="bbbbbb";
        String s2="abcabcbb";
        String s3="pwwkew";
        int len=lengthOfLongestSubstring(s2);
        System.out.println(len);


    }
}
