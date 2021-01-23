import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> primes = new ArrayList<>();
        primes.add(1);

        for(int i = 2; i < n; i++){
            boolean isPrime = checkIfPrime(i);
            if(isPrime){
                primes.add(i);
            }
        }

        for (Integer prime : primes) {
            if(prime == 1){
                System.out.println(prime);
                continue;
            }

            StringBuilder result = new StringBuilder("1");
            for(int i = 2; i <= prime; i++){
                boolean isPrime = checkIfPrime(i);
                if(isPrime){
                    result.append("1");
                } else {
                    result.append("0");
                }
            }
            System.out.println(result);
        }
    }

    private static boolean checkIfPrime(int n){
        if(n == 1){
            return false;
        } else {
            for(int i = 2; i <= n / 2; i++){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
