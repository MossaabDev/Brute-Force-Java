import java.util.List;

public class StringGenerator {
    //all allowed charcters
    private String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public StringGenerator() {
    }
    public String generateString(int num) {
        int a;
        String result = "";
        while (num >= 0) {
            result = result + allowedChars.charAt(num % allowedChars.length());
            num = (num / allowedChars.length()) - 1;
        }
        return result;
    }


}
