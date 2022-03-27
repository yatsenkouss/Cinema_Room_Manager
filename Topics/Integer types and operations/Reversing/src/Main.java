import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num1 = number / 100;
        int num2 = (number % 100) / 10;
        int num3 = number % 10;
        System.out.println(num3 * 100 + num2 * 10 + num1);
    }
}
