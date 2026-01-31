package com.mycompany.readytofightwithstring;

public class ReadytoFightwithString {

    public static void main(String[] args) {

        String s = "My name is mohit gole ";

        System.out.println("==============");
        System.out.println("====Check Polindrome ");
        System.out.println(Operations.checkPolindrdome(s));

        System.out.println("======================");
        System.out.println("Remove All Non - Alpha Numeric Value from String ");
        System.out.println(Operations.removeNonAlphaNumeric(s));
        System.out.println("====================================");
        System.out.println("Upper to Lower Case :");
        System.out.println(Operations.uppertoLower(s));

        System.out.println("===============================");
        System.out.println("Lower to Upper  Case :");
        System.out.println(Operations.lowertoUpper(s));

        System.out.println("Vowel count is a String : ");
        System.out.println(Operations.getvowelcount(s));

        System.out.println("=============");
        System.out.println("ConstonentCount :" + Operations.getCONSTANTcount(s));

        System.out.println("=========================");
        System.out.println("Replace Vowels From String : ");
        System.out.println(Operations.removeVowel(s));

        System.out.println("===============");
       // char name[]='m';

    

        int lenght =Operations.calculateLength(s);
        System.out.println("String is : "+s);
        System.out.println("Lenght os String is : "+lenght);
        System.out.println("=========================");
        String rev=Operations.reverseString(s);
        System.out.println("Reverse String ");
        System.out.println(rev);
       
        System.out.println("=========================");
   //     String rev2=Operations.reverseStringLeetcode(name);
        System.out.println("Reverse String ");
        System.out.println(rev);
        String rev1=Operations.reverse(s);
        System.out.println("Reverse String ");
        System.out.println(rev1);
        
         
        System.out.println("============");
        System.out.println("Count all Spaces from string in : ");
        String m="M                     ";
        System.out.println(s);
        System.out.println(Operations.countSpaceinString(s));
        System.out.println("Count all Spaces from string in : ");
      
        System.out.println(m);
        System.out.println(Operations.countSpaceinString(m));
             
       
        System.out.println("============");
        System.out.println("Remove  all Spaces from string in : ");
     
        System.out.println(s);
        System.out.println(Operations.removeSpaceFromString(s));
        System.out.println("Remove  all Spaces from string in : ");
        String n="M                     ";
        System.out.println(n);
        System.out.println(Operations.removeSpaceFromString(n));
        
        
        

    }
}
