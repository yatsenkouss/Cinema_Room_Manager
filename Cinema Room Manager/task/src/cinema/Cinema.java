package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        char ch = '%';
        int row;
        int rows;
        int seat;
        int seatsInRow;
        int costTicketFront = 10;
        int costTicketBack = 8;
        int costOneTickets;
        int current = 0;
        int point;
        int numberOfBoughtTickets = 0;

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seatsInRow = scanner.nextInt();

        String[][] cinema = new String[rows + 1][seatsInRow + 1];
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seatsInRow; j++) {
                if (i == 0 && j == 0) {
                    cinema[i][j] = "  ";
                } else if (i == 0) {
                    cinema[i][j] = Integer.toString(j) + " ";
                } else if (j == 0) {
                    cinema[i][j] = Integer.toString(i) + " ";
                } else {
                    cinema[i][j] = "S ";
                }
            }
        }

        do {
            System.out.println("\n1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            point = scanner.nextInt();
            switch (point) {
                case 1: {
                    cinemaHall(cinema,rows,seatsInRow);
                    break;
                }
                case 2: {
                    check = true;
                    do {
                        System.out.println("\nEnter a row number:");
                        row = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        seat = scanner.nextInt();
                        if (row > rows) {
                            System.out.println("Wrong input!");
                        } else if (seat > seatsInRow) {
                            System.out.println("Wrong input!");
                        } else if (cinema[row][seat] == "B ") {
                            System.out.println("\nThat ticket has already been purchased!");
                        } else {
                            cinema[row][seat] = "B ";
                            check = false;
                        }
                    } while (check);
                    if (rows * seatsInRow <= 60) {
                        costOneTickets = costTicketFront;
                    } else {
                        if (rows % 2 != 0) {
                            if (row <= (rows - 1) / 2) {
                                costOneTickets = costTicketFront;
                            } else {
                                costOneTickets = costTicketBack;
                            }
                        } else {
                            if (rows / 2 >= row) {
                                costOneTickets = costTicketFront;
                            } else {
                                costOneTickets = costTicketBack;
                            }
                        }
                    }
                    System.out.printf("\nTicket price: $%d\n", costOneTickets);
                    current += costOneTickets;
                    numberOfBoughtTickets++;
                    break;
                }
                case 3: {
                    double boughtTickets = numberOfBoughtTickets;
                    double totalSeats = rows * seatsInRow;
                    double percent = (boughtTickets / totalSeats) * 100;
                    System.out.printf("\nNumber of purchased tickets: %d\n", numberOfBoughtTickets);
                    System.out.print(String.format("Percentage: %.2f%c\n", percent, ch));
                    System.out.printf("Current income: $%d\n", current);
                    System.out.printf("Total income: $%d\n", calculatePrice(rows, seatsInRow, costTicketFront,
                            costTicketBack));
                    break;
                }
                case 0: {

                    break;
                }
            }
        } while (point !=0);
    }

    static void cinemaHall(String[][] cinema, int rows, int seatsInRow) {
        System.out.println("\nCinema:");
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seatsInRow; j++) {
                System.out.print(cinema[i][j]);
            }
            System.out.println();
        }
    }

    static int calculatePrice(int rows, int seatsInRow, int costTicketFront, int costTicketBack) {
        int frontSeats, backSeats, totalCostAllTickets;
        if (rows * seatsInRow <= 60) {
            totalCostAllTickets = rows * seatsInRow * costTicketFront;
        } else {
            if (rows % 2 != 0) {
                frontSeats = (rows - 1) / 2;
                backSeats = (rows + 1) / 2;
                totalCostAllTickets = (frontSeats * seatsInRow) * costTicketFront +
                        (backSeats * seatsInRow) * costTicketBack;
            } else {
                totalCostAllTickets = seatsInRow * rows / 2 * costTicketFront +
                        seatsInRow * rows / 2 * costTicketBack;
            }
        }
        return totalCostAllTickets;
    }
}