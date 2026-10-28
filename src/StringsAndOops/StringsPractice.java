package StringsAndOops;

public class StringsPractice {
    public static void main(String[] args){
        String str = "Hello Java";
        String str2 = "hello java";

        // 1. Find length
        System.out.println("Length: " + str.length());

        // 2. Get character at an index
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 4. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 5. Compare strings
        System.out.println("Equals: " + str.equals(str2));

        // 6. Compare ignoring case
        System.out.println("Equals Ignore Case: "
                + str.equalsIgnoreCase(str2));

        // 7. Extract substring
        System.out.println("Substring: " + str.substring(0, 5));

        // 8. Find character position
        System.out.println("Index of 'J': " + str.indexOf('J'));

        // 9. Check prefix
        System.out.println("Starts with Hello: "
                + str.startsWith("Hello"));

        // 10. Check suffix
        System.out.println("Ends with Java: "
                + str.endsWith("Java"));

        // 11. Replace characters
        System.out.println("Replace: " + str.replace('l', 'x'));

        // 12. Remove surrounding spaces
        String text = "  Java Programming  ";
        System.out.println("Trim: '" + text.trim() + "'");

        // 13. Concatenate strings
        System.out.println("Concatenation: " + str + " World");

        // 14. Reverse a string
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse: " + reversed);

        // 15. Convert to character array
        char[] chars = str.toCharArray();
        System.out.print("Characters: ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 16. Count vowels
        String word = "education";
        int vowels = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            }
        }

        System.out.println("Vowel count: " + vowels);

        // 17. Check palindrome
        String palindrome = "madam";
        String rev = new StringBuilder(palindrome)
                .reverse().toString();

        System.out.println("Is Palindrome: "
                + palindrome.equals(rev));
    }
}
