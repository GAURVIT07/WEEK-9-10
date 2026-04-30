// import java.util.Scanner;

// public class UniqueCharacters {

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

//     public static char[] findUniqueCharacters(String text) {
//         int length = findLength(text);
//         char[] temp = new char[length];
//         int uniqueCount = 0;

//         for (int i = 0; i < length; i++) {
//             char current = text.charAt(i);
//             boolean isUnique = true;

//             for (int j = 0; j < i; j++) {
//                 if (text.charAt(j) == current) {
//                     isUnique = false;
//                     break;
//                 }
//             }

//             if (isUnique) {
//                 temp[uniqueCount] = current;
//                 uniqueCount++;
//             }
//         }

//         char[] result = new char[uniqueCount];
//         for (int i = 0; i < uniqueCount; i++) {
//             result[i] = temp[i];
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String text = scanner.next();

//         char[] uniqueChars = findUniqueCharacters(text);

//         for (char ch : uniqueChars) {
//             System.out.print(ch + " ");
//         }
//     }
// }