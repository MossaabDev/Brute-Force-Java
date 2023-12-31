
public class Main {
    private static final int MAX_LENGTH = 5;

    public static void main(String[] args) {
        boolean found = false;
        String password = "aaaaa";

        if (password.length()>MAX_LENGTH){
            System.out.println("password should be less than " + MAX_LENGTH + " symbols");
            found = true;
        }else{
            long start = System.currentTimeMillis();
            //start brute force
            found = brute_force(password);
            long end = System.currentTimeMillis();
            if (found == true){
                System.out.println("Password Found! During : " + (end - start) + "milliseconds");
            }else {
                System.out.println("Failed in " + (end-start) + "milliseconds");
            }
        }
    }

    public static boolean brute_force(String s){
        StringGenerator stringGenerator = new StringGenerator();

        if (s != null){

            for (int i = 0; i < 1000000000; i++) {
                if (stringGenerator.generateString(i).equals(s)){
                    System.out.println("found : " + stringGenerator.generateString(i));
                    return true;
                }
            }
            return false;
        }else{
            System.out.println("The Password Is Null!");
            return false;
        }
    }
}
