package hotel;

import java.util.Scanner;

public class HotelCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {

            System.out.println("Room Revenue");
            int roomRevenue = scanner.nextInt();

            System.out.println("number of rooms sold");
            int nors = scanner.nextInt();

            int cal = roomRevenue / nors;

            System.out.println("ADR is " + cal + " $");



            System.out.println("Number of rooms occupied");
            int noro = scanner.nextInt();

            System.out.println("total number of rooms");
            int tnor = scanner.nextInt();

            int formula = tnor / noro * 10;

            System.out.println("occupancy Rate is "+formula + "%");
//        }
    }

}
