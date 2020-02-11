import java.util.Scanner;

public class CinemaBookingTest {
	
	static int number_of_adults;//variable to assign number of adults
	static int number_of_childrens;//variable to assign number of childrens
	static double balcony_fair; //variable to assign balcony seating fair
	static double Normal_fair; //variable to assign normal seating fair
	static double choosen_fair; // variable to assign choosen seating fair
	static int  seating; // variable to assign seating choice
	
	//Scanner class to input values
	static Scanner scanner_object = new Scanner(System.in);
	
	public static void main(String[] args) {
		//	Creating the object of the CinemaBooking class
		CinemaBooking constructor_obj_var= new CinemaBooking();
		System.out.println("Enter Theatre Name"); 
		constructor_obj_var.set_theatre_name(scanner_object.nextLine());
		
		//User choice to choose the type of seating 
		System.out.println("Select Balcony or Normal Seating");
		System.out.println("1.Balcony \n2.Normal Seating");
		seating=scanner_object.nextInt();
		
		// passing the seating type parameters to the setter 
		constructor_obj_var.set_type(seating);
		if(seating==1)
		{
			// assigning the balcony type seating fair
			balcony_fair=100.99;
			constructor_obj_var.set_seating("Balcony");
		}
		else
		{
			// assigning the normal type seating fair
			Normal_fair=80.50;
			constructor_obj_var.set_seating("Normal Seating");
		}
		
		System.out.println("How many Adult viewers"); 	
		constructor_obj_var.set_adults(scanner_object.nextInt());
		
		System.out.println("How many Children viewers"); 
		constructor_obj_var.set_childrens(scanner_object.nextInt());
		
		/*condition will check which type of seating price has value and assign the ticket fair to choosen fair variable */
		
		if(balcony_fair>0)
		{
			choosen_fair=balcony_fair;
		}
		else if(Normal_fair>0)
		{
			choosen_fair=Normal_fair;
		}
		
		//ticket price fair is passed using the setter using parameters
		constructor_obj_var.set_fair(choosen_fair);	
		//Using the getter fetching the booking cost
		constructor_obj_var.get_booking_cost();
		
		System.out.println("you booked tickets in "+constructor_obj_var.get_theatre_name()+" theatre");
		System.out.println("your seating preference is "+constructor_obj_var.get_seating());
		System.out.println("Number of adults "+constructor_obj_var.get_adults());
		System.out.println("Number of adults "+constructor_obj_var.get_childrens());
		System.out.println("Ticket fair for each Adult "+constructor_obj_var.get_fair());
		System.out.println("Ticket fair for each children "+(constructor_obj_var.get_fair()/2));
		System.out.println("Total cost is "+constructor_obj_var.get_booking_cost());

	}

}