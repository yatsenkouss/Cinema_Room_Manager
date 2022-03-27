import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 1;
        while (counter * counter <= n) {
            System.out.println(counter * counter);
            counter++;
        }
    }
}