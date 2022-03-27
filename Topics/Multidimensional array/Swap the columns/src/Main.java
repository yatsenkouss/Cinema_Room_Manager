import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        int size2 = scanner.nextInt();
        int[][] array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int point1 = scanner.nextInt();
        int point2 = scanner.nextInt();
        for (int i = 0; i < size1; i++) {
            int temp = array[i][point1];
            array[i][point1] = array[i][point2];
            array[i][point2] = temp;
        }
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}