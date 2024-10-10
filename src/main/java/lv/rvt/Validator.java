package lv.rvt;

public class Validator {
    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }
}
