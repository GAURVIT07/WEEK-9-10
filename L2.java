// import java.util.Scanner;

// public class StringLengthWithoutMethod {

//     public static int findLength(String text) {
//         int count = 0;

//         try {
//             while (true) {
//                 text.charAt(count);
//                 count++;
//             }
//         } catch (Exception e) {
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String text = scanner.next();

//         int customLength = findLength(text);
//         int actualLength = text.length();

//         System.out.println(customLength);
//         System.out.println(actualLength);
//     }
// }



// import java.util.Scanner;

// public class StringSplitCompare {

//     public static int findLength(String text) {
//         int count = 0;
//         try {
//             while (true) {
//                 text.charAt(count);
//                 count++;
//             }
//         } catch (Exception e) {
//         }
//         return count;
//     }

//     public static String[] splitText(String text) {
//         int length = findLength(text);
//         int wordCount = 1;

//         for (int i = 0; i < length; i++) {
//             if (text.charAt(i) == ' ')
//                 wordCount++;
//         }

//         int[] spaceIndexes = new int[wordCount - 1];
//         int index = 0;

//         for (int i = 0; i < length; i++) {
//             if (text.charAt(i) == ' ') {
//                 spaceIndexes[index] = i;
//                 index++;
//             }
//         }

//         String[] words = new String[wordCount];

//         int start = 0;
//         for (int i = 0; i < spaceIndexes.length; i++) {
//             int end = spaceIndexes[i];
//             String word = "";

//             for (int j = start; j < end; j++) {
//                 word += text.charAt(j);
//             }

//             words[i] = word;
//             start = end + 1;
//         }

//         String lastWord = "";
//         for (int i = start; i < length; i++) {
//             lastWord += text.charAt(i);
//         }
//         words[wordCount - 1] = lastWord;

//         return words;
//     }

//     public static boolean compareArrays(String[] arr1, String[] arr2) {
//         if (arr1.length != arr2.length)
//             return false;

//         for (int i = 0; i < arr1.length; i++) {
//             if (!arr1[i].equals(arr2[i]))
//                 return false;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String text = scanner.nextLine();

//         String[] customSplit = splitText(text);
//         String[] builtInSplit = text.split(" ");

//         boolean result = compareArrays(customSplit, builtInSplit);

//         for (String word : customSplit) {
//             System.out.print(word + " ");
//         }
//         System.out.println();

//         for (String word : builtInSplit) {
//             System.out.print(word + " ");
//         }
//         System.out.println();

//         System.out.println(result);
//     }
// }