import java.util.List;

public class StringGenerator {
    //all allowed charcters
    private char[] allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    StringBuilder result = new StringBuilder();
    public StringGenerator() {
    }
    public String generateString(int num) {
        result.setLength(0);
        while (num >= 0) {
            result.append(allowedChars[num % allowedChars.length]);
            num = (num / allowedChars.length) - 1;

        }
        return result.toString();
    }


}
