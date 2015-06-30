package model;

public class split {

	public static void main(String[] args) {
		String s="12,86,513,84,,6,48,6,6,4,6,1,12";
		String[] array=s.split(",");
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}

	}

}
