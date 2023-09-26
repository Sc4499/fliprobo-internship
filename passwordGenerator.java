import java.util.*;

class Password_Generator {

    public static void main(String[] args) {
        String upper_Case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower_Case = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialChar = "<>,.+-=/{}[]@#$%^&*!";
        String combination = upper_Case + lower_Case + specialChar + num;

        int minLen = 8;
        int maxLen = 16;
        int len = minLen + new Random().nextInt(maxLen - minLen + 1);
        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = combination.charAt(new Random().nextInt(combination.length()));
        }

        String generatedPassword = new String(password);

        String strength = PasswordStrength(generatedPassword);

        System.out.println("Generated password is: " + generatedPassword);
        System.out.println("Strength: " + strength);
    }

    public static String PasswordStrength(String password) {
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasLowerCase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d+.*");
        boolean hasSpecialChar = !password.matches("[A-Za-z0-9 ]*");

        if (password.length() >= 8 && password.length() <= 16) {
            if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                return "Very Strong";
            } else if ((hasUpperCase || hasLowerCase) && hasDigit && hasSpecialChar) {
                return "Strong";
            } else {
                return "Weak";
            }
        } else {
            return "Invalid Length";
        }
    }
}
