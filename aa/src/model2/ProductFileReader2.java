package model2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ProductFileReader2 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("D:/product.txt"));
		String line = reader.readLine();
		while(line!=null){
			String[] array = line.split(",");
			ProductBean productBean = new ProductBean(array);
			line = reader.readLine();
		}

	}

}
