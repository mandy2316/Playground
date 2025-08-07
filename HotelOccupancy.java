//This program calculates hotel's occupancy rate.
import java.util.Scanner;
public class HotelOccupancy {
	
  private static Scanner kb;
	public static void main(String[] args) {
		kb = new Scanner(System.in);
		int floor;// total number of floors
		int floorNum = 1;// to record which floor we are working right now.
		int room; //rooms for one floor
		int roomTotal = 0; //total number of rooms in this hotel.
		int occ; // occupied rooms on one floor.
		int occTotal = 0; // total rooms that been occupied in this hotel.
		int vacant; // vacant rooms
		double rate; // the hotel occupancy rate.
		
		System.out.println("Please enter the total number of floors: ");
		floor = kb.nextInt();
		while(floor < 1) {
			System.out.println("The number of floors should not less than 1");
			System.out.println("Please reenter a value for floors: ");
			floor = kb.nextInt();
		}
		while(floorNum <= floor) {
			System.out.println("Please enter the total number of rooms on floor " +floorNum + ": ");
			room = kb.nextInt();
			while(room<10) {
				System.out.println("The number of floors should not less than 10");
				System.out.println("Please reenter a value for rooms: ");
				room = kb.nextInt();
			}
			System.out.println("Please enter the number of occupied rooms: ");
			occ = kb.nextInt();
			while(occ>room) {
				System.out.println("The occupied rooms should not more than the number of rooms");
				System.out.println("Please reenter a value for occupied rooms: ");
				occ = kb.nextInt();
			}
			roomTotal = roomTotal +room;
			occTotal = occTotal + occ;
			floorNum++;
		}
		vacant = roomTotal - occTotal;
		double a = occTotal;// cover the total number of occupied rooms to double.
		double b = roomTotal;// cover total number of rooms to double.
		rate = (a / b) * 100;
		System.out.println("Total Number of rooms in hotel: " + roomTotal);
		System.out.println("Total Occupied rooms in hotel: " + occTotal);
		System.out.println("Total Vacant rooms in hotel: " + vacant);
		System.out.println("Hotel Occupancy Rate: " + rate + "%");	
	}
}
