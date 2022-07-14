public class Strings {
    public static void main(String[] args) {
        // creating a string using String class.
        String imStr = "Chandrakant";
        // calling methods of String class.
        // length of the string
        System.out.println(imStr.length());
        // finding the substring of the string
        System.out.println(imStr.substring(2));
        // this substring does not include the endIndex
        System.out.println(imStr.substring(2, 4));
        System.out.println();
        // convert to uppercase
        System.out.println(imStr.toUpperCase());
        // convert to lowercase
        System.out.println(imStr.toLowerCase());
        // check if the string start with a ...
        System.out.println(imStr.startsWith("c"));
        System.out.println(imStr.startsWith("C"));
        System.out.println();

        // comparing strings
        // if strings are same java does not creat a new object rather it just stores a
        // reference to the string in the memory.
        String imStr2 = "Chandrakant";
        String imStr3 = "chandrakant";
        // equals(Object) compares the string with case
        System.out.println(imStr2.equals(imStr3));
        // the following ignores the case of the string.
        System.out.println(imStr2.equalsIgnoreCase(imStr3));
        // compares the string ignores the case
        System.out.println(imStr == imStr2);
        System.out.println();
        // Do not use the == operator to compare Strings
        // Unless you can guarantee that all strings have been interned.
        // you should not use the == or != operators to compare Strings.
        // These operators actually test references, and since multiple String objects
        // can represent the same String, this is liable to give the wrong answer.
        // use of new keyword creates a new object and they do not have same reqfernce
        String imStr4 = new String("Chandrakant");
        // eauals() will give true whereas == will give false
        // as one later checks reference and they dont reference to the same object.
        System.out.println(imStr4.equals(imStr2));
        System.out.println(imStr2 == imStr4);
        System.out.println();
        System.out.println(imStr4.contains("kant"));
        System.out.println(imStr.equals(imStr3));
        System.out.println();

        // a(97) is greater than A(65) as per ASCII values
        // compares and returns 0 if both are lexically equal.
        // returns +ve value if s1 is greater than s2
        // returns -ve value if s2 is greater than s1
        System.out.println(imStr3.compareTo(imStr4));
        System.out.println(imStr4.compareTo(imStr));
        System.out.println();

        // indexOf() returns negative if not present
        System.out.println(imStr.indexOf("y"));
        // it can also check if a substring is present after a index
        System.out.println(imStr.indexOf("kant", 7));
        System.out.println();

        // concatenation creates a new object with the appended string.
        System.out.println("Concatenated " + imStr4 + " Dubey");
        System.out.println();
        // check for Palindrome
        System.out.println("Is palindrome: " + isPal("AB"));
        System.out.println();
        // check for substring
        System.out.println("Is substring:" + isSubStr(imStr, "Chan"));
        System.out.println();
        // Anagram
        System.out.println("Is Anagram: " + isAnagram("listen", "tislen"));
        // leftmost repeating char
        System.out.println("Left most repeating character.: " + leftMostRepeatingChar("Bobby"));
        System.out.println();
        // leftmost non repeating char
        System.out.println("Left most non repeating character" + leftMostNonRepeatingChar("chandrakantC"));
        // to lower case implementation
        System.out.println(toLowerCaseStr("Chandrakant Dubey"));
        // to Upper case
        System.out.println(toUpperCaseStr("chandrakant dubey"));
        // Reverse the string
        System.out.println(revStr("Chandrakant Dubey"));
    }

    static boolean isPal(String str) {
        int len = str.length();
        for (int i = 0, j = len - 1; i <= len / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    static boolean isSubStr(String str1, String str2) {
        int j = str2.length();
        int i = str1.length();
        if (str2.length() > str1.length())
            return false;
        for (i = 0, j = 0; i < str1.length() && j < str2.length();) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else
                i++;
        }
        if (j == str2.length())
            return true;
        else
            return false;
    }

    static final int CHAR = 256;

    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int[] strarr = new int[CHAR];
        for (int i = 0; i < str1.length(); i++) {
            strarr[str1.charAt(i)]++;
            strarr[str2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (strarr[i] != 0)
                return false;
        }
        return true;
    }

    static int leftMostRepeatingChar(String str) {
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 1)
                return i;
        }
        return -1;
    }

    static int leftMostNonRepeatingChar(String str) {
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    static String revString(String str) {
        char[] chararr = str.toCharArray();
        int chararrlen = chararr.length;
        for (int i = 0; i < chararrlen; i++) {
            // char tempChar = chararr[chararrlen-1];

        }
        return "0";
    }

    static String toLowerCaseStr(String str) {
        char[] chararr = str.toCharArray();
        int chararrlen = chararr.length;
        for (int i = 0; i < chararrlen; i++) {
            // char tempChar = chararr[chararrlen-1];
            char d = chararr[i];
            if (d >= 'A' && d <= 'Z') {
                d += 32;
                chararr[i] = d;
            }
        }
        String str1 = String.valueOf(chararr);
        return str1;
    }

    static String toUpperCaseStr(String str) {
        char[] chararr = str.toCharArray();
        int chararrlen = chararr.length;
        for (int i = 0; i < chararrlen; i++) {
            // char tempChar = chararr[chararrlen-1];
            char d = chararr[i];
            if (d >= 'a' && d <= 'z') {
                d -= 32;
                chararr[i] = d;
            }
        }
        String str1 = String.valueOf(chararr);
        return str1;
    }

    static String revStr(String str) {
        char[] chararr = str.toCharArray();
        int chararrlen = chararr.length;
        for (int i = 0; i < chararrlen; i++) {

        }
        return str;
    }
}
