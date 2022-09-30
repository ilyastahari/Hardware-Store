public class Date {
	
	private int month;
	private int day;
	private int year;
	private String date_string;

	Date(String date){
		// converts mm/dd/yyyy to seperate variables
		String[] tokens = date.split("/");
		this.month = Integer.valueOf(tokens[0]);
		this.day = Integer.valueOf(tokens[1]);
		this.year = Integer.valueOf(tokens[2]);
		this.date_string = date;
	}

	public String getDate(){
		return this.date_string;
	}

	public int getMonth(){
		return this.month;
	}

	public void setMonth(int month){
		this.month = month;
	}

    public int getDay(){
		return this.day;
	}

	public void setDay(int day){
		this.day = day;
	}

    public int getYear(){
		return this.year;
	}

	public void setYear(int year){
		this.year = year;
	}
}
