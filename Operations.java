package com.mycompany.readytofightwithstring;

public class Operations {

    public static String removeNonAlphaNumeric(String s) {

        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                result = result + ch;
            }
        }

        return result;
    }

    public static boolean checkPolindrdome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static int countSpaceinString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }

        return count;
    }

    public static String removeSpaceFromString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {

            } else {
                result = result + ch;
            }
        }

        return result;

    }

    static int calculateLength(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            count++;
        }
        return count;
    }

    public static int getvowelcount(String s) {
        int vowelcount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I') {
                vowelcount++;
            }

        }
        return vowelcount;

    }

    public static String removeVowel(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I')) {
                result = result + ch;
            }
        }
        return result;
    }

    public static String uppertoLower(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static String lowertoUpper(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    public static int getCONSTANTcount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I')) {
                    count++;
                }

            }
        }
        return count;
    }

    public static void reverseStringLeetcode(char[] s) {

        int st = 0;
        int e = s.length - 1;
        while (st < e) {
            char temp = s[st];
            s[st] = s[e];
            s[e] = temp;
            st++;
            e--;

        }
    }

    public static String reverseString(String s) {
        String rev = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    public static String reverse(String s) {
        String rev = "";
        int i = s.length() - 1;
        while (i >= 0) {
            rev = rev + s.charAt(i);
            i--;
        }
        return rev;
    }

//  public static  boolean checkPolindrome(String s){
//      String rev ="";
//      int i =s.length()-1;
//      while(i>=0){
//          rev=rev+s.charAt(i);
//          i--;
//      }
//      if(s.compareTo(rev)==1){
//          return true ;
//      }
//      else{
//          return false ;
//      }
//  }
//  
//  
    public static boolean isPolindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
}
