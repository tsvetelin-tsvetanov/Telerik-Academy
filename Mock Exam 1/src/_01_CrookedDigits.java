import java.util.Scanner;

public class _01_CrookedDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        n = n.replace(".", "");
        n = n.replace("-", "");

        do{
            char[] digits = n.toCharArray();
            int sum = 0;
            for(int i = 0; i < digits.length; i++){
                sum += Integer.parseInt(String.valueOf(digits[i]));
            }
            n = sum + "";
        } while(Integer.parseInt(n) > 9);

        System.out.println(n);
    }
}
