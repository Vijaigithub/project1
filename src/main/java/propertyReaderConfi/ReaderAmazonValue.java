package propertyReaderConfi;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReaderAmazonValue {

	Properties p;
	public ReaderAmazonValue() throws Exception {
		
		File f =new File("D:\\eclipse-workspace\\Amazon\\src\\main\\java\\PropertyFile\\AmazonFIle");
		
		FileInputStream  fis=new FileInputStream(f);
		
		 p  =new Properties();
		p.load(fis);
	}

//create all the method u want to access the input files

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
}
