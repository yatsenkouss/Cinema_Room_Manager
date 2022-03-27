import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String cloneWord = word.toLowerCase();
        boolean j = cloneWord.startsWith("j");
        System.out.println(j);
    }
}