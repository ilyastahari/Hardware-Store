public class ProductY extends Product{

	ProductY(int id, String name, double price, char type) {
		super(id, name, price, type);
	}

@Override
	public double total(double price, int amount, Date date) {
        double output;
        if (amount>100 && amount<500) {
            price = price - (price*0.05); /** If the number of amounts is greater than 100 and less than 500, there will be a
                                              5 percent discount on the price of the product. */
            output = amount*price;
        }
        else if (amount>500 && amount<1500) {
            price = price - (price*0.15);/** If the number of amounts is greater than 500 and less than 1500, there will be a
                                             15 percent discount on the price of the product. */
            output = amount*price;
        }
        else if (amount>1500) {
            price = price - (price*0.25); /** If the number of amounts is greater than 1500 and less than 500, there will be a
                                              25 percent discount on the price of a product*/
            output = amount*price;
        }
        else {
            output = amount*price; /** If the user purchased less than 100 amounts, there will be no discount. */
        }   
    
		return output;
	}
	
}