public class Ex_01 {
    public static void main(String[] args) {
        int x = 12;
        System.out.println("Divizors of "+ x + " are:");
        getDivisors(x);
    }

    //Compilator recommends to make following method's modifier private instead of public. Why?
    public static void getDivisors(int number){
        for (int i = number; i > 0; i--){
            if (number % i == 0)
                System.out.print(number/i + " ");
        }
    }
}
