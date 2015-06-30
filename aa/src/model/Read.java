package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class Read {

	public static void main(String[] args) throws Exception{
		List<ProductBean> list = new ArrayList<ProductBean>();
		
		BufferedReader read = new BufferedReader(new FileReader("D:/product.txt"));
		
		String source;
		while((source=read.readLine())!=null){
			String[] arrayS = source.split(",");
			for(int i=0; i<arrayS.length; i++){
				System.out.println(arrayS[i]);
			}
//			ProductBean db = new ProductBean();
//			db.setId(array[0]);
			
		}
		
		
		 
		
		

	}

}
