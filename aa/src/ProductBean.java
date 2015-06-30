

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProductBean {
	private int id;
	private String name;
	private double price;
	private java.util.Date make;
	private int expire;
	
	//id
	//push the stored "id" back to main program (ReadProductBean) .
	public int getId() {
		return id;
	}
	//convert String received from aryS[0] into Integer and store the result in "id" .
	public void setId(String id) {
		this.id = Integer.parseInt(id);
	}
	
	//name
	//push the stored "name" back to main program (ReadProductBean) .
	public String getName() {
		return name;
	}
	//store the String received from aryS[1] in "name" .
	public void setName(String name) {
		this.name = name;
	}
	
	//price
	//push the stored "price" back to main program (ReadProductBean) .
	public double getPrice() {
		return price;
	}
	//convert the String received from aryS[2] into Double and store the result in "price" .
	public void setPrice(String price) {
		this.price = Double.parseDouble(price);
	}
	
	//date
	//push the stored "make" back to main program (ReadProductBean) .
	public java.util.Date getMake() {
		return make;
	}
	//convert the String received from aryS[3] into "Date format" and store the result in "make" .
	public void setMake(String make) {
		//call SimpleDateFormat API, give it a nickname "date" and define the format received from main program is "yyyy-MM-dd" .
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		//try-catch-finally block starts
		try {
			//try if the date can be set or not.
			//if yes, do it.
			//if no, break and jump to catch block.
			this.make = date.parse(make);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	// method expire
	//push the stored "expire" back to main program (ReadProductBean) .
	public int getExpire() {
		return expire;
	}
	//convert the String received from aryS[4] into Integer and store the result in "expire" .
	public void setExpire(String expire) {
		this.expire = Integer.parseInt(expire);
	}
	
	
	
}
