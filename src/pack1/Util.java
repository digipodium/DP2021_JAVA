package pack1;

public class Util {
    public static String capitalize(String value) {
        String firstLetter = value.substring(0, 1).toUpperCase();
        return firstLetter + value.substring(1);
    }
}
