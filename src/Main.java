import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * Function that returns the numbers up to the N number of the Fibonnaci sequence.
     *
     * @param n N number (top limit)
     * @return A list that contain all the numbers up to the N number of the Fibonnaci sequence.
     * */
    public static Integer[] Fibonnaci(int n){

        ArrayList<Integer> fibo = new ArrayList<>();

        fibo.add(1);

        if(n == 1){
            return fibo.toArray(new Integer[0]);
        }
        else if(n == 2){
            fibo.add(1);
            return fibo.toArray(new Integer[0]);
        }
        else{
            fibo.add(1);
            for (int i = 2; i < n; i++) {
                fibo.add(fibo.get(i-1)+fibo.get(i-2));
            }

            return fibo.toArray(new Integer[0]);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true){
            System.out.println("\nWelcome to calculate the Fibonnaci program");
            System.out.println("(1) - Find the numbers in the Fibonnaci sequence");
            System.out.println("(2) - Exit");
            System.out.print("Select an option above:");
            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Max limit: ");
                        int limit = sc.nextInt();
                        for (int i : Fibonnaci(limit)) {
                            System.out.println(i);
                        }
                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nInvalid option");
                }
            }
            catch (Exception e) {
                System.out.println("\nInvalid option");
                sc.nextLine();
            }
        }

    }
}
