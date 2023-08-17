package pro1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertyreader {

	
	public static String getProperty(String pr) {
		
		
		
		Properties p = new Properties();
		
		File f = new File(System.getProperty("user.dir")+"//config.properties");
		
		FileReader read = null;
		try {
			read = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p.load(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return  p.getProperty(pr);
		
	}
}
