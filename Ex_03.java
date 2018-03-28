public class Ex_03 {
    public static void main(String[] args) {
        int a1 = 4, b1 = 7;
        int a2 = 10, b2 = 8;
        getFloors(a1, b1);
        getFloors(a2, b2);
    }

    public static void getFloors(int a, int b){
        if (a > b){
            for (int i = a; i >= b; i--)
                System.out.print(i+" ");
            System.out.println("");
        }
        else if (a < b){
            for (int i = a; i <=b; i++)
                System.out.print(i+" ");
            System.out.println("");
        }
        else System.out.println("Doesn't move! Same floor!");
    }
}
