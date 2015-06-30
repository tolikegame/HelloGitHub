package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		try(
				FileInputStream fis = new FileInputStream("D:/1.jpg");
				FileOutputStream fos= new FileOutputStream("D:/2.jpg");
				) {
			
			byte[] buffer = new byte[1024*2];
			int size = fis.read(buffer);
			
			while(size!=-1){
				fos.write(buffer, 0, size);
				size = fis.read(buffer);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
