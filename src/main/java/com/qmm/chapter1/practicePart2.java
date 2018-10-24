package com.qmm.chapter1;

/**
 *
 * @author qinmengmei
 * @date 2018/10/19
 */
public class practicePart2 {

    /**
     * 1.2.4
     */
    public static void test124(){
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        System.out.println(string1);
        System.out.println(string2);
    }

    /**
     * 1.2.6
     */
    public static boolean test126(){
        String s = "ACTGACG";
        String t = "TGACGAC";
        if (s.length() != t.length()){
            return false;
        }else {
            int i = s.indexOf(t.substring(0, 1));
            if (t.equals(s.substring(i,s.length()) + s.substring(0,i)))
                return true;
            else
                return false;
        }
    }

    /**
     * 1.2.7
     * @return
     */
    public static String test127(String s){
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0,N/2);
        String b = s.substring(N/2,N);
        return test127(a) + test127(b);
    }

    public static void main(String[] args) {
//        test124();

//        System.out.println(test126());

        System.out.println(test127("sdxvcf"));
    }

}
