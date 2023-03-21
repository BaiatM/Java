package com.Tutoring;

public class Class01 {
    // STRING
    public static void main(String[] args) {
        String str1 ="Welcome Home!";
        // 1. Change Case Of String
        System.out.println(str1.toUpperCase()); // all to upper
        System.out.println(str1.toLowerCase()); // all to lower

        // 2. Equality of String Str==Str
        String str2 = "Welcome Home!";
        System.out.println(str1.equals(str2)); // true/false

        // 3. Equals ignoring case

        System.out.println(str1.equalsIgnoreCase(str2)); // true/false

        // 4. Contains
        String str4 = "Hello Chirag, Welcome to Ebay";
        str1 = "welcome";

        System.out.println(str4.contains(str1)); // true -> resul=?
        // str1 = "Welcome"

        // 5. Character at Particular Index
        System.out.println(str4.charAt(15));// e starting point is 0 !

        System.out.println(str4.charAt(5)); // result =?

        // 6. Index of Particular character -> returns the number of the index of that particular character or string
        System.out.println(str4.indexOf('e'));// result = ? 14
        // we can also add a word for indexOf method

        // 7. Length of the String
        String test = "Hello"; // length = 5
        String test1 = "Welcome"; // length =?

        System.out.println(test.length());

        // 8. Check if String is empty
        String str5 = "";
        System.out.println(str5.isEmpty()); // false -> the whole String data
        System.out.println(str5.isBlank()); // true  -> if we have spaces then its gonna return true

        // 9. Trim - trimming spaces before and after String
        String str6 = "             Hello     World     ";
        System.out.println(str6.trim());

        // 10. SubString
        String str7 = "Hello User, Welcome to Ebay";
        System.out.println(str7.substring(1)); // when we give only one digit for the substring, that digit is our starting point
        System.out.println(str7.substring(0,6)); // result = Hello ?  starting point and ending point
        System.out.println(str7.substring(3,10)); // result = lo User ?

        // 11. Format -> regex
        String title = "Hello %s, Welcome to %s";
        String user = "Chirag";
        String website = "Amazon";
        System.out.println(String.format(title,user,website));

        // 12. Replace -> regex
        String title1 = "Hello ZZZ, Welcome to $$$";
        System.out.println(title1.replace("ZZZ", user));
        System.out.println(title1.replace("$$$", website));
        // replaceAll() - We will learn this one once we cover the regular expression

        // 13. Split
        String title2 = "Hello User , Welcome to Ebay";

        String words[] =  title2.split(","); // Hello, User, ',', Welcome, to, Ebay
        System.out.println(words.length);

        System.err.println("WARNING");


    }
}
