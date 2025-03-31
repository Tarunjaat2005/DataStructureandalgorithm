package String;

public class Minnumberogoperations {

    // This method returns the minimum number of operations
    public static int minOperations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            throw new IllegalArgumentException("Strings must have equal length.");
        }

        int operations = 0;

        // Go through the strings and count differences
        for (int i = 0; i < str1.length(); i++) {
            // If characters at the same position are different, an operation is required
            if (str1.charAt(i) != str2.charAt(i)) {
                operations++;  // one operation to change str1[i] to str2[i]

                // Check if adjacent characters will cause issues if changed
                if (i > 0 && str2.charAt(i) == str1.charAt(i - 1)) {
                    operations++;  // Conflict with the previous character
                }
                if (i < str1.length() - 1 && str2.charAt(i) == str1.charAt(i + 1)) {
                    operations++;  // Conflict with the next character
                }
            }
        }

        return operations;
    }

    public static void main(String[] args) {
        String str1 = "zxyz";
        String str2 = "zyxz";

        System.out.println(minOperations(str1, str2));  // Expected output: 6
    }
}
