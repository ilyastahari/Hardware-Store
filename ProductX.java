public class ProductX extends Product{

	ProductX(int id, String name, double price, char type) {
		super(id, name, price, type);
	}

	@Override
	public double total(double price, int amount, Date date) {	
        double output;
        output = amount*price;
        return output;
    }
}