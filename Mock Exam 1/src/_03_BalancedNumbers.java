import java.util.Scanner;

public class _03_BalancedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isBalanced = true;
        do {
            int n = Integer.parseInt(scanner.nextLine());
            int a = n / 100;
            int b = (n - (a*100)) / 10;
            int c = (n - (a*100) - b * 10);

            if((a + c) == b){
                sum += n;
            } else {
                isBalanced = false;
            }

        } while (isBalanced);

        System.out.println(sum);
    }
}
