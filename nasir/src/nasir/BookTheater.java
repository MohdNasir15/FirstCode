package nasir;

public class BookTheater {
int total_seats=10;
synchronized void bookSeat(int seats ) {
	if (total_seats >=seats) {
		System.out.println(seats + " seats booked successfully");
		total_seats=total_seats-seats;
		System.out.println("seats leaft :  +total-seats");
	}
	else {
		System.out.println("sorry seats can not booked::!!");
		System.out.println("seats Left: +total-seats");
	}
}
}
public class MovieBookApp extends Thread{
	static BookTheater b;
	int seats;
	public void run () {
		
		b.bookSeat(seats);
	}
	public static void main (String[]args) {
		b=new BookTheater();
		MovieBookApp nasir=new MovieBookApp(); 
		nasir.seats=7;
		nasir.start();
		MovieBookApp amit =new MovieBookApp();
		amit.seats=6;;
		amit.start();
		}
}
