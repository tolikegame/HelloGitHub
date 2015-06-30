
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ReadProductBean {
	//program starts here !!
	public static void main(String[] args) {
		
		
		
		//define a Collection List named ProductBean, give it a variable called "list" .
		List<ProductBean> list = new ArrayList<>();
		
		
		
		
		//call BufferReader, give a nickname "reader" and set default value "null" .
		BufferedReader reader = null;
		//try-catch-finally block starts
		try {
			//try reader can read file or not.
			//if yes, continue.
			//if no, stop immediately and jump to catch block !!
			reader = new BufferedReader(new FileReader("C:/Users/Student/Box Sync/product.txt"));
			
			//define a blank String.
			String source;
			
			//create a while loop to help us read the whole file. (read one line per loop)
			//while the info read from file is not null, do this while loop one time.
			//otherwise, discard this while loop.
			while ((source = reader.readLine()/* << store the info read from the file to "source"*/) != null) {
				
				//find character "," and split the part before it from "source".
				String[] aryS = source.split(",");
				
/////////////////////////////////////////// TEST CODE ///////////////////////////////////////////
//				for (int i = 0; i < aryS.length; i++){
//				System.out.println(aryS[i]);
//				}
/////////////////////////////////////////// TEST CODE ///////////////////////////////////////////

				//call class "ProductBean" and define it's nickname in this program is "pb" .
				ProductBean pb = new ProductBean();
				
				//call method setId which is built in ProductBean.
				//handle in sub program (ProductBean) .
				pb.setId(aryS[0]);
				
				//call method setName which is built in ProductBean.
				//String to String doesn't need any handle, just store it or convert it to different text code like UTF-8.
				//I just store this String.
				pb.setName(aryS[1]);
				
				//call method setPrice which is built in ProductBean.
				//handle in sub program (ProductBean) .
				pb.setPrice(aryS[2]);
				
				//handle in sub program (ProductBean) .
				//call method setMake which is built in ProductBean.
				pb.setMake(aryS[3]);
				
				//call method setExpire which is built in ProductBean.
				//handle in sub program (ProductBean) .
				pb.setExpire(aryS[4]);
				
/////////////////////////////////////////// TEST CODE ///////////////////////////////////////////
//				System.out.print(pb.getId()+" ; ");
//				System.out.print(pb.getName()+" ; ");
//				System.out.print(pb.getPrice()+" ; ");
//				System.out.print(pb.getMake()+" ; ");
//				System.out.print(pb.getExpire()+" ; \n");
/////////////////////////////////////////// TEST CODE ///////////////////////////////////////////
				
				//add the converted result in list created in line 18
				list.add(pb);
				
				
				
				
				
				
				
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//no matter try success or fail, do this block after try.
		finally {
			//try to close the reader because eclipse told us to.
			try {
				reader.close();
			}
			//if it fails to close or has any error, do catch block.
			catch (IOException e) {
				e.printStackTrace();
			}
			//there's no need to write another finally block.
		}
		
		
		
		
		
		
		
		
		
//////////////// This Part is ready for cooperate with SQL database ////////////////
/**/	
/**/	//currently these two for loop only print memory address.
/**/	//but in future, it can be use to store the result into database.
/**/	
/**/	//for loop
/**/	for (Iterator<ProductBean> itpb = list.listIterator() ; itpb.hasNext() ; ) {
/**/		System.out.println(itpb.next());	
/**/	}
/**/	System.out.println("\n-------------------------------------");
/**/	//for-each loop
/**/	for (ProductBean a : list){
/**/		System.out.println(a);	
/**/	}
/**/
//////////////// This Part is ready for cooperate with SQL database ////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main block close

} // class close
