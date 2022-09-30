public abstract class Product {
	private int id;
	private String name;
	private double price;
	private char type;
	static int count;

	Product(int id, String name, double price, char type){
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	Product(Product p){
		this.id = p.getid();
		this.name = p.getname();
		this.price = p.getPrice();
		this.type = p.gettype();
	}


	/**
	 * Getter for name
	 */
	public String getname(){
		return this.name;
	}

	/**
	 * Setter for name
	 * @param name new value for name
	 */
	public void setname(String name){
		this.name = name;
	}

	/**
	 * Getter for id
	 */
	public int getid(){
		return this.id;
	}

	/**
	 * Setter for id
	 * @param id new value for id
	 */
	public void setid(int id){
			this.id = id;
	}

	public double getPrice(){
		return this.price;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public char gettype(){
		return this.type;
	}

	public void setType(char type){
		this.type = type;
	}
  
	public String dollarANDcents(){
		int priceDollars = (int) getPrice();
		double cents = (getPrice()-priceDollars)*100;
		long priceCents = Math.round((cents));
		String output = priceDollars + " Dollars " + priceCents + " Cents";
		return output;
	}

	@Override
	public boolean equals(Object p){
		if(p instanceof Product){
			Product temp = (Product)p;
			return (this.getid() == temp.getid());
		}else{
			return false;
		}	
	}

	@Override 
	public String toString(){
		String s ="";
		s = id + " " + name + " ";
		return s;
	}

	public abstract double total(double price, int amount, Date date);
}