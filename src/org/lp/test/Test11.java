package org.lp.test;

public class Test11 {
    public static void main(String[] args) {
//        System.out.println("sjjj");
        String str = "how are you lp and you today is friday";
        String[] str1 = str.split("\\s"); //  /s  空格  转义    分割

        for(String s : str1){
            String str2  = s;
            s = String.valueOf(s.charAt(0));
            s = s.toUpperCase();
            s = s.concat(str2.substring(1));
            System.out.println("s:"+ s);
        }
    }

}
