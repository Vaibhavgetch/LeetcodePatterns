package DSA.POTD;

import java.util.HashMap;
import java.util.Map;

public class Leetcode1347 {

    public static void main(String[] args) {
        String s = "leetcode" ;
        String t = "practice" ;

        int i = minSteps(s, t);
        System.out.println(i);

    }

    public static int minSteps(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        int ans = 0 ;

        for(int i = 0 ; i < t.length () ; i++){
            if(!tmap .containsKey(t.charAt(i))){
                tmap.put(t.charAt(i), 1);
            }
            else{
                tmap.put(t.charAt(i), tmap.get(t.charAt(i)) + 1);
            }
            if(!smap .containsKey(s.charAt(i))){
                smap.put(s.charAt(i), 1);
            }
            else{
                smap.put(s.charAt(i), smap.get(s.charAt(i)) + 1);
            }
        }

        for(Map.Entry<Character, Integer> map : tmap.entrySet()){
            char key = map.getKey();
            int val = map.getValue();

            if(smap.containsKey(key)){
                int temp= Math.abs(val - smap.get(key));
                ans += temp;
            }
            else{
                ans += val ;
            }
        }
        return ans ;
    }
}
