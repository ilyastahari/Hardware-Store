public class ProductZ extends Product{

	ProductZ(int id, String name, double price, char type) {
		super(id, name, price, type);
	}

	@Override
	public double total(double price, int amount, Date date) {
        double output = 0; /** Output is initialized. */
       
        int month = date.getMonth();
        int day = date.getDay();

        if (month == 9) {
            if (day>=15 && day<=30) {
                int free = amount/3;
                int paid = amount-free;
                output = paid*price; /** If the month is September and the day is between 15 and 30 (including 15 and 30), the
                                         user is eligible for a buy 2 get 1 free offer. */
            }
        } else if (month == 10) {
            if (day > 0 && day<15) {
                int free = amount/3;
                int paid = amount-free;
                output = paid*price;  /** If the month is October and the day is between 1 and 14 (including 1 and 14), the
                user is eligible for a buy 2 get 1 free offer. */
            }
        }
        else {
         output = amount*price; /** If the date is not between September 15 and October 14, there will be no buy 2 get 1 free offer. */
     }  
        System.out.printf("The total" + " is: $%.2f", output);
		return output;
	}
}
	