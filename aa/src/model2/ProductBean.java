package model2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ProductBean {
	private int id;
	private String name;
	private double price;
	private java.util.Date make;
	private int expire;
	List<ProductBean> list = new ArrayList<ProductBean>();
	
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	@Override
	public String toString() {
		
		return "{"+id+":"+name+":"+price+":"+make+":"+expire+"}";
	}
	public ProductBean(String[] array){
		if(array!=null && array.length==5){
			id = ProductBean.convertInt(array[0]);
			name = (array[1]);
			price =ProductBean.covertDouble(array[2]);
			make = ProductBean.convertDate(array[3]);
			expire = ProductBean.convertInt(array[4]);
			System.out.println(array);
		}else{
			throw new IllegalArgumentException("Input Array length incorrect : "+array.length);
		}
	}
	

	private static SimpleDateFormat sDateFormat =new SimpleDateFormat("yyyy-MM-dd");
	public static java.util.Date convertDate(String data){
		java.util.Date result=null;
		try {
			result=sDateFormat.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			result=new java.util.Date(0);
		}
		return result;
	}
	public static int convertInt(String data){
		int result=0;
		try {
			result = Integer.parseInt(data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = -1000;
		}
		return result;
	}
	public static double covertDouble(String data){
		double result = 0;
		try {
			result = Double.parseDouble(data);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = -1;
		}
		return result;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public java.util.Date getMake() {
		return make;
	}
	public void setMake(java.util.Date make) {
		this.make = make;
	}
	public int getExpire() {
		return expire;
	}
	public void setExpire(int expire) {
		this.expire = expire;
	}	
}
