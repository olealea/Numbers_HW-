public class Ex_02 {
    public static void main(String[] args) {
        int x = 23;
        int y = 45;
        //to prime or not to prime? :)
        System.out.print(isPrime(x) ? (x + " is prime") : (x + " is not prime; ") );
        System.out.print(isPrime(y) ? (y + " is prime") : (y + " is not prime; ") );
    }

    public static boolean isPrime(int number){
        for (int i = 2; i < number ; i++){
            if (number % i == 0)
                return true;
        }
        return false;
    }
}
