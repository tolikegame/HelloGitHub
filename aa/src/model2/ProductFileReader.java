package model2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductFileReader {
	private List<ProductBean> beans = new ArrayList<ProductBean>();
	public List<ProductBean> getBeans(){
		return beans;
	}
	private File input ;
	public ProductFileReader(String name) {
		input = new File(name);
		this.init();
	}
	private void init() {
		try(
			BufferedReader br = new BufferedReader(new FileReader(input));) {
			String line = br.readLine();
			while(line!=null) {
				String[] array = line.split(",");
				ProductBean pb = new ProductBean(array);
				beans.add(pb);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String name = "D:/product.txt";
		ProductFileReader reader = new ProductFileReader(name);
		
	}
}
