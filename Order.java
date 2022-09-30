public class Order {
	
    private Date date;
	private User user;
	private Product product;
	private int amount;
	private double total;
	
    Order(Date date, User user, Product product, int amount){
		
        this.date = date;
		this.amount = amount;
        this.product = product;
        this.amount = amount;
        this.total = this.product.total(product.getPrice(), amount, date);
    }

    public void output(){

		System.out.println("*********************************");
		System.out.println("Date: " + date.getDate());
		System.out.println("*********************************");
		System.out.println(user.getfullName());
		System.out.println("+----+--------------+------+----+");
        System.out.println("ID: " + product.getid());
        System.out.println("Product: " + product.getname());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Type :" + product.gettype());
        System.out.println("+----+--------------+------+----+");
        System.out.println("Amount: " + amount);
        System.out.println("*********************************");
        System.out.println("Total: " + total);
        System.out.println();

	}

	// getters and setters for each
    public Date getdate(){
		return this.date;
	}

	public void setdate(Date date){
		this.date = date;
	}

    public User getuser(){
		return this.user;
	}

	public void setuser(User user){
		this.user = user;
	}

    public Product getproduct(){
		return this.product;
	}

	public void setproduct(Product product){
		this.product = product;
	}

    public int getamount(){
		return this.amount;
	}

	public void setamount(int amount){
		this.amount = amount;
	}

    public double gettotal(){
		return this.total;
	}

	public void settotal(double total){
		this.total = total;
	}

}