/**
 * CinemaBooking class will initialise the values of the defined variables 
 * Class has getters and setters these are used to get the values of the variables
 * and set the values to the variables. It has a method which will return the ticket booking cost
 * get_booking_cost() is a double return type method, it returns the final ticket price of booking
 */
public class CinemaBooking {
	private String theatre_name; //variable for assigning theatre name
	private int type; // variable for assigning option of type of seating
	private int adult_viewers; // variable for assigning number of adult viewers
	private int child_viewers; // variable for assigning number of child viewers
	private String theatre_seating; //variable for assigning the name of type of seating
	private double ticket_price; //variable for assigning the ticket price
	private double adult_ticket_price; //variable for assigning the adult ticket price
	private double child_ticket_price; // variable for assigning the children ticket price
	private double final_price; //variable for assigning the final price of booking
	
	//Default Constructor is used to assign all variables to default values
	public CinemaBooking()
	{
		theatre_name="";
		type=0;
		adult_viewers=0;
		child_viewers=0;
		ticket_price=0;
		adult_ticket_price=0;
		child_ticket_price=0;
		final_price=0;	
		theatre_seating="";
	}
	
	/** Sets the value of the theatre name to that specified in the argument.
	 *
	 * @param theatre the String value at which the theatre_name should be set
	 */
	public void set_theatre_name(String theatre) {
		this.theatre_name = theatre;
	}
	
	/** Returns the theatre name.
	 * 
	 * @return the name of theatre.
	 */
	public String get_theatre_name() {
		return this.theatre_name;
	}
	
	/** Sets the value of the seating to that specified in the argument.
	 *
	 * @param seating the String value at which the theatre_seating should be set
	 */
	public void set_seating(String seating) {
		this.theatre_seating = seating;
	}
	
	/** Returns the theatre seating.
	 * 
	 * @return the name of the seating choosen.
	 */
	public String get_seating() {
		return this.theatre_seating;
	}
	
	/** Sets the value of the type to that specified in the argument.
	 *
	 * @param type the int value at which the type of seating should be set
	 */
	public void set_type(int type) {
		this.type = type;
	}
	
	/** Returns the option type of seating.
	 * 
	 * @return the option type of the seating choosen.
	 */
	public int get_type() {
		return this.type;
	}
	
	/** Sets the value of the number of adult viewers to that specified in the argument.
	 *
	 * @param adult_viewers the int value at which the number of adult viewers should be set
	 */
	public void set_adults(int adult_viewers) {
		this.adult_viewers = adult_viewers;
	}
	
	/** Returns the number of adults.
	 * 
	 * @return the number of adult viewers.
	 */
	public int get_adults() {
		return this.adult_viewers;
	}
	
	/** Sets the value of the number of child viewers to that specified in the argument.
	 *
	 * @param child_viewers the int value at which the number of child viewers should be set
	 */
	public void set_childrens(int child_viewers) {
		this.child_viewers = child_viewers;
	}
	
	/** Returns the number of children.
	 * 
	 * @return the number of children viewers.
	 */
	public int get_childrens() {
		return this.child_viewers;
	}
	
	/** Sets the value of the ticket price to that specified in the argument.
	 *
	 * @param ticket_price the int value at which the ticket price should be set
	 */
	public void set_fair(double ticket_price) {
		this.ticket_price = ticket_price;
	}
	
	/** Returns the ticket price.
	 * 
	 * @return the ticket fair of the choosen seating type.
	 */
	public double get_fair() {
		return this.ticket_price;
	}
	
	/** Returns the ticket price.
	 * 
	 * @return the ticket fair of the choosen seating type.
	 */
	public double get_booking_cost() {
		//Checks whether the ticket price is not 0
		//if the price is 0 then the calculation cannot be done
		if(ticket_price!=0)
		{
			//Calculating the final price for number of adults
			this.adult_ticket_price=adult_viewers*ticket_price;
			//Calculating the final price for number of childrens
			this.child_ticket_price=(ticket_price/2)*child_viewers;
			
			/**condition will check if adults viewers an childrens viewers are not 0;
			 * calculation will be based upon the number of adult viewers * ticket price
			 * children ticket will be calculated as number of children * half of the adult ticket price
			 * final booking price will be returned based upon the calculation peformed
			 */
			if(adult_viewers!=0 && child_viewers!=0)
			{
				final_price=this.adult_ticket_price+this.child_ticket_price;
			}
			else if(adult_viewers!=0)
			{
				final_price=this.adult_ticket_price;
			}
			else if(child_viewers!=0)
			{
				final_price=this.child_ticket_price;
			}				
		}
		return final_price;
	}

}