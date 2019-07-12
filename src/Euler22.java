import java.io.FileInputStream;

public class Euler22 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:/00-job/p022_names.txt");
			
			int readData = -1;
			while((readData = fis.read()) != -1) {
	
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally{
            try{
                fis.close();
            }
            catch(Exception e){
                System.out.println(e);
            }			
		}
	}

}
