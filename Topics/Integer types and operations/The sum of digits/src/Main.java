import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOne = number / 100;
        int numberTwo = (number % 100) / 10;
        int numberThree = number % 10;
        System.out.println(numberThree + numberTwo + numberOne);
    }
}