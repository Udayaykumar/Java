
public class gameNew {
	
	int car;

	 public gameNew (String carName) {	 
		 System.out.println("My Car Name is: " + carName);
	 }
	 
	 public void setYear (int year) {		 
		 car = year;
	 }
	 
	 public int getYear( ) {
		 System.out.println("Production year: " + car);		
		 return car;
	 }

	 public static void main(String[] args) {
		 
		 gameNew myCar =  new gameNew ("BMW");
		 myCar.setYear(2018);
		 myCar.getYear();
		 
		 System.out.println("Model design: " + myCar.car);
	 }
}
