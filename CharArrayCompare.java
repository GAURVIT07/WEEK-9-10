// import java.util.Scanner;

// public class StringCompare {

//     public static boolean compareUsingCharAt(String str1, String str2) {
//         if (str1.length() != str2.length())
//             return false;

//         for (int i = 0; i < str1.length(); i++) {
//             if (str1.charAt(i) != str2.charAt(i))
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String str1 = scanner.next();
//         String str2 = scanner.next();

//         boolean result1 = compareUsingCharAt(str1, str2);
//         boolean result2 = str1.equals(str2);

//         System.out.println(result1);
//         System.out.println(result2);
//     }
// }




// import java.util.Scanner;

// public class SubstringCompare {

//     public static String createSubstring(String text, int start, int end) {
//         String result = "";

//         for (int i = start; i < end; i++) {
//             result += text.charAt(i);
//         }

//         return result;
//     }

//     public static boolean compareStrings(String s1, String s2) {
//         if (s1.length() != s2.length())
//             return false;

//         for (int i = 0; i < s1.length(); i++) {
//             if (s1.charAt(i) != s2.charAt(i))
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String text = scanner.next();
//         int start = scanner.nextInt();
//         int end = scanner.nextInt();

//         String sub1 = createSubstring(text, start, end);
//         String sub2 = text.substring(start, end);

//         boolean result = compareStrings(sub1, sub2);

//         System.out.println(sub1);
//         System.out.println(sub2);
//         System.out.println(result);
//     }
// }





// import java.util.Scanner;

// public class CharArrayCompare {

//     public static char[] getCharacters(String text) {
//         char[] arr = new char[text.length()];

//         for (int i = 0; i < text.length(); i++) {
//             arr[i] = text.charAt(i);
//         }

//         return arr;
//     }

//     public static boolean compareArrays(char[] arr1, char[] arr2) {
//         if (arr1.length != arr2.length)
//             return false;

//         for (int i = 0; i < arr1.length; i++) {
//             if (arr1[i] != arr2[i])
//                 return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String text = scanner.next();

//         char[] arr1 = getCharacters(text);
//         char[] arr2 = text.toCharArray();

//         boolean result = compareArrays(arr1, arr2);

//         System.out.println(result);
//     }
}